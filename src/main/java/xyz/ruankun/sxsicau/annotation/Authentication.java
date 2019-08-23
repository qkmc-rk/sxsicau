package xyz.ruankun.sxsicau.annotation;

import xyz.ruankun.sxsicau.util.constant.AuthAopConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
//@Deprecated
public @interface Authentication {

    /**
     * true为启用验证
     * false为跳过验证
     * @return
     *
     */
    boolean needAuth() default true;
    AuthAopConstant role() default AuthAopConstant.ANON;
}
