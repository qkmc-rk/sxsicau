package xyz.ruankun.sxsicau.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.ruankun.sxsicau.entity.News;

public interface NewsRespository extends JpaRepository<News, Integer> {
}
