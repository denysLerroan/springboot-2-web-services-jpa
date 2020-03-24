package com.prospect.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prospect.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
