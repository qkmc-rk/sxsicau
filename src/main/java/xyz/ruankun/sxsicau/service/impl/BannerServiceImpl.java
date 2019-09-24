package xyz.ruankun.sxsicau.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ruankun.sxsicau.entity.Banner;
import xyz.ruankun.sxsicau.repository.BannerRespository;
import xyz.ruankun.sxsicau.service.BannerService;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerRespository bannerRespository;

    @Override
    public List<Banner> findAll() {
        return bannerRespository.findAll();
    }

    @Override
    public Banner findBannerById(int id) {
        Optional<Banner> banner = bannerRespository.findById(id);
        // Optional不为空则获取Banner并返回
        if (banner.isPresent()) {
            return banner.get();
        }
        return null;
    }

}
