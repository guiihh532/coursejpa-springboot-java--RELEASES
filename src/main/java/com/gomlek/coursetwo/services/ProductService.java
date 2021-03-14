package com.gomlek.coursetwo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gomlek.coursetwo.entities.Product;
import com.gomlek.coursetwo.repositories.ProductRepository;
import com.gomlek.coursetwo.services.exceotions.ResourceNotFoundException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
