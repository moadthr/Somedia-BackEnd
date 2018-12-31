package com.somedia.article.controller;

import com.somedia.article.entity.Article;
import com.somedia.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleProvider {
    @Autowired
    private ArticleService articleService;


    @GetMapping(path="/all")
    public List<Article> getAll() {
        return articleService.getAll();
    }
}
