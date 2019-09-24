package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.ruankun.sxsicau.entity.Banner;

public interface BannerRespository extends JpaRepository<Banner, Integer> {

}
