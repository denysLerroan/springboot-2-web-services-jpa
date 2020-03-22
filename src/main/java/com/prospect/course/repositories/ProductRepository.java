package com.prospect.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospect.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
