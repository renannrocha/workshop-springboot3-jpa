package com.renannrocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renannrocha.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
