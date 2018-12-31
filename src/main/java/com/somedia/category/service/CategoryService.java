package com.somedia.category.service;

import com.somedia.article.entity.Article;
import com.somedia.article.repository.ArticleRepository;
import com.somedia.category.entity.Category;
import com.somedia.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> getAll() {
        return repository.findAll();
    }
}
