package com.gomlek.coursetwo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.coursetwo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
