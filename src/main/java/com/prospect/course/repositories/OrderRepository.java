package com.prospect.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospect.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
