package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.News;

/**
 * @Author NingXiang
 * @Date 2019-9-23 16:35:07
 */
public interface NewsRespository extends JpaRepository<News, Integer> {
}
