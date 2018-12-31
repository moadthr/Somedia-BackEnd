package com.somedia.order.entity;

import com.somedia.article.entity.Article;
import com.somedia.client.entity.Client;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  long id;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Article> articles;
    private int quantité;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Client client;

    public Order() {
    }

    public Order(List<Article> articles, int quantité, Client client) {
        this.articles = articles;
        this.quantité = quantité;
        this.client = client;
    }
}
