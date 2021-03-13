package com.gomlek.coursetwo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.coursetwo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
