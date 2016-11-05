package com.edu.agh.articles;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asiab on 2016-10-17.
 */
@Transactional
public interface ArticleRepository extends Repository<Article, Long> {

    public Article findByArtNumber(String number);
    Article save(Article article);
}
