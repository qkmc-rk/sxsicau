package xyz.ruankun.sxsicau.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.ruankun.sxsicau.entity.News;
import xyz.ruankun.sxsicau.repository.NewsRespository;
import xyz.ruankun.sxsicau.service.NewsService;

import java.util.List;

/**
 * @Author NingXiang
 * @Date 2019-9-23 16:36:55
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRespository newsRespository;

    @Override
    public List<News> findAll() {
        return newsRespository.findAll();
    }
}
