package com.trySpring.trySpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trySpring.trySpring.Repository.ProductRepository; 
import com.trySpring.trySpring.model.Product;

@Service
public class ProductService{
	
	@Autowired
	ProductRepository repo;

	public List<Product> getAll() {
		return repo.findAll();
	}

	public Product getSingle(int id) {
		return repo.findById(id).orElse(null);
	}

}