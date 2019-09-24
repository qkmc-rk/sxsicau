package xyz.ruankun.sxsicau.service;

import xyz.ruankun.sxsicau.entity.Banner;

import java.util.List;

public interface BannerService {
    List<Banner> findAll();
    Banner findBannerById(int id);
}
