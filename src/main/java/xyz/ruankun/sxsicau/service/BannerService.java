package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.entity.Banner;

import java.util.List;

/**
 * @Author NadevXiang
 * @Date 2019-9-23 15:23:48
 */
public interface BannerService {
    List<Banner> findAll();
    Banner findBannerById(int id);
}
