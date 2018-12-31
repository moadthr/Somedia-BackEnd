package com.somedia.category.repository;

import com.somedia.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
