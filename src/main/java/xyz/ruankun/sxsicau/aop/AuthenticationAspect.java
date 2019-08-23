package xyz.ruankun.sxsicau.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import xyz.ruankun.sxsicau.annotation.Authentication;
import xyz.ruankun.sxsicau.entity.WxToken;
import xyz.ruankun.sxsicau.entity.WxUser;
import xyz.ruankun.sxsicau.service.UserService;
import xyz.ruankun.sxsicau.util.Constant;
import xyz.ruankun.sxsicau.util.constant.AuthAopConstant;
import xyz.ruankun.sxsicau.vo.ResponseEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * 该类用于权限控制，一个身份一般只具有一个身份 , 但也可能同时具备
 * 学生或者教师
 */
@Aspect
@Component
public class AuthenticationAspect {

    @Autowired
    UserService userService;

    public final static Logger logger = LoggerFactory.getLogger(AuthenticationAspect.class);

    @Pointcut(value = "@annotation(xyz.ruankun.sxsicau.annotation.Authentication)")
    public void pointcut() {}


    /**
     * 与被注释方法正确返回之后执行
     */
    @AfterReturning(value = "@annotation(xyz.ruankun.sxsicau.annotation.Authentication)")
    public void after() {
        logger.info("刷新缓存");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        String token = request.getHeader("token");
        WxToken wxToken = null;
        if (token != null)
            wxToken = userService.getWxTokenByToken(token);
        if (wxToken != null && wxToken.getUserId() != null){
            if (userService.updateUserToken(wxToken.getUserId()) != null)
                logger.info("刷新缓存成功");
        }else {
            logger.error("没能刷新token，因为没有从数据库找到token信息:" + token + ", 额外信息: " + wxToken.toString());
        }
    }

    @Around("pointcut() && @annotation(authentication)")
    public Object interceptor(ProceedingJoinPoint proceedingJoinPoint, Authentication authentication) {

        boolean pass = authentication.needAuth();
        //要验证权限
        AuthAopConstant role = authentication.role();
        if (pass && !role.equals(AuthAopConstant.ANON)) { // ！-> 不等于
            //通过拿到的role,我们可以知道能处理这个请求的角色是什么
            //如果是匿名者，直接放行，如果是用户，就需要用户的权限才行，管理员则需要管理员的角色才行
            //规定一致，token放在header中
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                    .getRequestAttributes()).getRequest();
            String token = request.getHeader("token");
            if (token == null) {
                //请求时没有token
                //权限错误，返回错误
                ResponseEntity responseEntity = new ResponseEntity();
                responseEntity.success(Constant.AUTH_ERROR, "没有权限,禁止访问", null);
                return responseEntity;
            }
            AuthAopConstant realRole = authenticate(token, request.getRequestURI());
            if (realRole == role || role == AuthAopConstant.BOTH) {
                //权限正确，去访问吧
                try {
                    return proceedingJoinPoint.proceed();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                    ResponseEntity responseEntity = new ResponseEntity();
                    responseEntity.success(Constant.AOP_SERVER_ERROR, "AOP_SERVER_ERROR", null);
                    logger.error("aop鉴权完成，但是程序执行出错,应该是程序抛出了未处理的异常");
                    return responseEntity;
                }
            } else {
                //权限错误，返回错误
                ResponseEntity responseEntity = new ResponseEntity();
                responseEntity.success(Constant.AUTH_ERROR, "没有权限,禁止访问", null);
                return responseEntity;
            }
        } else {
            //不验证权限
            try {
                return proceedingJoinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                ResponseEntity responseEntity = new ResponseEntity();
                responseEntity.success(Constant.AOP_SERVER_ERROR, "", null);
                return responseEntity;
            }
        }
    }

    /**
     * 这个方法用于判断该token所属的到底是谁(管理员？ 用户？ 匿名？)
     *
     * @param token
     * @return
     */
    private AuthAopConstant authenticate(String token, String path) {
        WxToken wxToken = userService.getWxTokenByToken(token);
        if (wxToken == null ||  wxToken.getUserId() == null || wxToken.getUserId() == 0){
            //显然这个token是假的
            return AuthAopConstant.ANON;
        }
        //是有身份的人了
        WxUser wxUser = userService.getUser(wxToken.getUserId());
        if (wxUser.getBlack()){
            logger.error("黑人用户！" + wxUser.toString());
            return AuthAopConstant.ANON;
        }else if (wxUser.getBindingRole() == null){
            logger.error("此用户未绑定信息,无法鉴别身份！");
            return AuthAopConstant.ANON;
        }else
            if (wxUser != null && wxUser.getBindingRole() == Constant.TEACHER){
                return AuthAopConstant.TEACHER;
            }else if (wxUser != null && wxUser.getBindingRole() == Constant.STUDENT){
                return AuthAopConstant.STUDENT;
            }else {
                return AuthAopConstant.ANON;
            }
    }
}
