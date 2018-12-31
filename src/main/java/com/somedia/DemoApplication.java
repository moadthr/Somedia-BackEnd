package com.somedia;

import com.somedia.article.entity.Article;
import com.somedia.article.repository.ArticleRepository;
import com.somedia.category.entity.Category;
import com.somedia.category.repository.CategoryRepository;
import com.somedia.client.entity.Client;
import com.somedia.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaRepositories(basePackages="com.somedia.*")
public class DemoApplication extends SpringBootServletInitializer {
   /*@Autowired
    ArticleRepository articleRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ClientRepository clientRepository;
    */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

    }

 /* @Bean
    CommandLineRunner init (ArticleRepository articleRepository,CategoryRepository categoryRepository) {
        return args -> {
            Category c1 = new Category("DVD", null);
            Category c2 = new Category("Book", null);
            Article a = new Article("Harry Potter ", "L.G King", 5, c1);
            Article b = new Article("Rich ad and Poor Dad ", "lysook", 10, c2);
            List<Article> l = new ArrayList<>();
            l.add(a);
            c1.setArticles(l);
            List<Article> l2= new ArrayList<>();
            l.add(b);
            c2.setArticles(l2);
            categoryRepository.save(c1);
            categoryRepository.save(c2);
            articleRepository.save(a);
            articleRepository.save(b);
            Client moad = new Client("moad","thr","moadthr@gmail.com","moad123");
            clientRepository.save(moad);
            };
              }
*/






}
