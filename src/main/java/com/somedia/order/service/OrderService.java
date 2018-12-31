package com.somedia.order.service;

import com.somedia.article.entity.Article;
import com.somedia.article.repository.ArticleRepository;
import com.somedia.order.entity.Order;
import com.somedia.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> getAll() {
        return repository.findAll();
    }

}
