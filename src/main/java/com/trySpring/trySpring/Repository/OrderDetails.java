package com.trySpring.trySpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trySpring.trySpring.model.OrderDetail;

public interface OrderDetails extends JpaRepository<OrderDetail, Long> {

}