package me.xueyao.sde.dao;

import me.xueyao.sde.domain.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author XueYao
 * @date 2017-11-21
 */
public interface ArticleRepository extends ElasticsearchRepository<Article,Integer> {



}
