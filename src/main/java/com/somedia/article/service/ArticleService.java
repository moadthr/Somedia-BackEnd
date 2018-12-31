package com.somedia.article.service;

import com.somedia.article.entity.Article;
import com.somedia.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService  {

    @Autowired
    private ArticleRepository repository;

    public List<Article> getAll() {
        return repository.findAll();
    }

}
