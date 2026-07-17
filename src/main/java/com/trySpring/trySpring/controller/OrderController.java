package com.trySpring.trySpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.trySpring.trySpring.dto.OrderDetailDTO;
import com.trySpring.trySpring.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody OrderDetailDTO order) {

        service.saveOrder(order);

        return ResponseEntity.ok("Order Placed Successfully");
    }

}