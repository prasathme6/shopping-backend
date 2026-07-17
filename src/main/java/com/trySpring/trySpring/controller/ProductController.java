package com.trySpring.trySpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trySpring.trySpring.model.Product;
import com.trySpring.trySpring.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getAll(){
    	return service.getAll();
    }
    
    @GetMapping("/products/{id}")
    public Product getSingle(@PathVariable int id) {
    	return service.getSingle(id);
    }
    
}