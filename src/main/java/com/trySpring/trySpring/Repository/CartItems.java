package com.trySpring.trySpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trySpring.trySpring.model.CartItem;

public interface CartItems extends JpaRepository<CartItem, Long> {

}