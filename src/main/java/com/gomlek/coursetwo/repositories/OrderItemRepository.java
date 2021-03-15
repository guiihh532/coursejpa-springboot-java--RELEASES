package com.gomlek.coursetwo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.coursetwo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
