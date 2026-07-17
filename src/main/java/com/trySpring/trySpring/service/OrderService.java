package com.trySpring.trySpring.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trySpring.trySpring.Repository.CartItems;
import com.trySpring.trySpring.Repository.OrderDetails;
import com.trySpring.trySpring.dto.CartItemsDTO;
import com.trySpring.trySpring.dto.OrderDetailDTO;
import com.trySpring.trySpring.model.CartItem;
import com.trySpring.trySpring.model.OrderDetail;

@Service
public class OrderService {

    @Autowired
    private OrderDetails orderRepo;

    @Autowired
    private CartItems cartRepo;

    public void saveOrder(OrderDetailDTO request) {

        // Save Order Details
        OrderDetail order = new OrderDetail();
        order.setCustomerName(request.getCustomerName());
        order.setCustomerEmail(request.getCustomerEmail());
        order.setTotalAmount(request.getTotalAmount());
        order.setOrderDate(LocalDateTime.now());

        OrderDetail savedOrder = orderRepo.save(order);

        // Save Cart Items
        for (CartItemsDTO item : request.getItems()) {

            CartItem cartItem = new CartItem();

            cartItem.setProductId(item.getProductId());
            cartItem.setCustomerName(item.getCustomerName());
            cartItem.setTitle(item.getTitle());
            cartItem.setPrice(item.getPrice());
            cartItem.setQuantity(item.getQuantity());
            cartItem.setImage(item.getImage());

            // Foreign Key
            cartItem.setOrder(savedOrder);

            cartRepo.save(cartItem);
        }
    }
}