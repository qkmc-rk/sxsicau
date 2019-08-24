package xyz.ruankun.sxsicau.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * 该controller是一个匿名可访问的controller, 主要职责：
 *  1. 导师信息查询,根据导师姓名或者工号就可以查询教师的简历信息
 *  2. 导师信息查询,返回导师列表,返回所有专业的导师信息,前端自由过滤
 *  3. 企业信息查询,输入企业名字,就能查找到一部分企业的列表信息
 *  4. 企业信息查询, 根据企业的三要素,查询企业的详细信息
 *  5. 主页banner信息查询,返回banner信息列表
 *  6. 主页banner信息查询,根据bannerId返回banner代表的相信静态页面信息
 *  7. 查询推荐的实习报告
 */

@RestController
public class AnonymityController {

}
