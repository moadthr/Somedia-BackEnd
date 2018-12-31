package com.somedia.article.repository;

import com.somedia.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article, Long> {

}
