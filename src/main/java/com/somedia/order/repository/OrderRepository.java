package com.somedia.order.repository;

import com.somedia.article.entity.Article;
import com.somedia.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
