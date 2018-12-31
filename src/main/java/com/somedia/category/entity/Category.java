package com.somedia.category.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.somedia.article.entity.Article;
import lombok.Getter;
import lombok.Setter;
import org.dom4j.tree.DefaultEntity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "category")
public class Category  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long id;
    public String libelle;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category",fetch = FetchType.LAZY)
    public List<Article> articles ;


    public Category(String libelle) {
        this.libelle = libelle;
    }

    public Category(String libelle, List<Article> articles) {
        this.libelle = libelle;
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", articles=" + articles +
                '}';
    }

    public Category() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
