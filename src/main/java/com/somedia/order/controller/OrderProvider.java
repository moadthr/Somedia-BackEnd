package com.somedia.order.controller;

import com.somedia.article.entity.Article;
import com.somedia.article.service.ArticleService;
import com.somedia.order.entity.Order;
import com.somedia.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderProvider {
    @Autowired
    private OrderService orderService;


    @GetMapping(path="/all")
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
