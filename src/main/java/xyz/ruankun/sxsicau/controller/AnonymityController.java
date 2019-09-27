package xyz.ruankun.sxsicau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.ruankun.sxsicau.entity.Auth;
import xyz.ruankun.sxsicau.entity.Banner;
import xyz.ruankun.sxsicau.entity.News;
import xyz.ruankun.sxsicau.entity.Teacher;
import xyz.ruankun.sxsicau.repository.AuthRespository;
import xyz.ruankun.sxsicau.service.BannerService;
import xyz.ruankun.sxsicau.service.NewsService;
import xyz.ruankun.sxsicau.service.UserInfoService;
import xyz.ruankun.sxsicau.vo.ResponseEntity;
import xyz.ruankun.sxsicau.vo.fvo.CorporationVO;

import java.util.ArrayList;
import java.util.List;

/**
 * 该controller是一个匿名可访问的controller, 主要职责：
 * 1. 导师信息查询,根据导师姓名或者工号就可以查询教师的简历信息
 * 2. 导师信息查询,返回导师列表,返回所有专业的导师信息,前端自由过滤
 * 3. 企业信息查询,输入企业名字,就能查找到一部分企业的列表信息
 * 4. 企业信息查询, 根据企业的三要素,查询企业的详细信息(暂时不做，不提供)
 * 5. 主页banner信息查询,返回banner信息列表
 * 6. 主页banner信息查询,根据bannerId返回banner代表的相信静态页面信息
 * 7. 查询推荐的实习报告
 */

@RestController
@RequestMapping("/public")
public class AnonymityController {

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    BannerService bannerService;

    @Autowired
    NewsService newsService;

    /**
     * 根据导师姓名或者工号就可以查询教师的简历信息
     */
    private String resume = "请参考ResumeController中的根据教师的职工号获取教师简历信息";

    /**
     * 返回导师列表
     */
    @GetMapping("/teachers")
    public ResponseEntity getTeacherList() {
        List<Teacher> teachers = userInfoService.findAllTeachers();
        if (teachers == null) {
            return ControllerUtil.getFalseResultMsgBySelf("没有找到导师数据，或者查询过程抛出了异常，请见log");
        } else {
            return ControllerUtil.getDataResult(teachers);
        }
    }

    /**
     * 根据企业的模糊名字查询企业，返回一个企业列表。
     *
     * @param fuzzyName 企业的模糊名字
     * @return
     */
    @GetMapping("/corporation/{fuzzyName}")
    @Deprecated
    public ResponseEntity findCorpListByName(@PathVariable String fuzzyName) {
        CorporationVO corporationVO = new CorporationVO();
        corporationVO.setName(fuzzyName);
        List<CorporationVO> ans = new ArrayList<>();
        ans.add(corporationVO);
        corporationVO = new CorporationVO();
        corporationVO.setName("其它公司");
        ans.add(corporationVO);
        return ControllerUtil.getDataResult(ans);
    }

    /**
     * 返回所有Banner
     *
     * @Param:
     * @return: java.util.List<xyz.ruankun.sxsicau.entity.Banner>
     */
    @GetMapping("/banners")
    public ResponseEntity getBannerList() {
        return ControllerUtil.getDataResult(bannerService.findAll());
    }

    /**
     * 根据BannerId返回Banner
     *
     * @Param: id
     * @return: xyz.ruankun.sxsicau.entity.Banner
     */
    @GetMapping("/banner/{id}")
    public ResponseEntity findBannerById(@PathVariable int id) {
        Banner banner = bannerService.findBannerById(id);
        if (banner == null) {
            return ControllerUtil.getFalseResultMsgBySelf("未查找到该BannerId相关的数据");
        } else {
            return ControllerUtil.getSuccessResultBySelf(banner);
        }
    }


    /**
     * 返回所有News
     *
     * @Param:
     * @return: java.util.List<xyz.ruankun.sxsicau.entity.News>
     */
    @GetMapping("/news")
    public ResponseEntity findNews() {
        return ControllerUtil.getDataResult(newsService.findAll());
    }


}
