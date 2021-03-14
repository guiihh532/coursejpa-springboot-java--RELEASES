package com.gomlek.coursetwo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.coursetwo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
