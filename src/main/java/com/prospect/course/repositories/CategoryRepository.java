package com.prospect.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospect.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
