package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.ruankun.sxsicau.entity.Banner;

/**
 * @Author NadevXiang
 * @Date 2019-9-23 15:25:26
 */

public interface BannerRespository extends JpaRepository<Banner, Integer> {

}
