package com.somedia.article.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.somedia.category.entity.Category;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;


@Table(name = "article")
@Entity
public class Article implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String title;
    private String auteur;
    private int quantite;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    Category category;


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", quantite=" + quantite +
                ", category=" + category +
                '}';
    }



    public Article() {
    }

    public Article(String title, String auteur, int quantite, Category category) {
        this.title = title;
        this.auteur = auteur;
        this.quantite = quantite;
        this.category = category;
    }
}
