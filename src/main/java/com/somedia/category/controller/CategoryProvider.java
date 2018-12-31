package com.somedia.category.controller;

import com.somedia.article.entity.Article;
import com.somedia.category.entity.Category;
import com.somedia.category.repository.CategoryRepository;
import com.somedia.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryProvider {
    @Autowired
    public CategoryService categoryService;

    @GetMapping(path="/all")
    public List<Category> getAll() {
        return categoryService.getAll();
    }
}
