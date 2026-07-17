package com.trySpring.trySpring.dto;

import java.util.List;

public class OrderDetailDTO {

    private String customerName;

    private String customerEmail;

    private Double totalAmount;

    private List<CartItemsDTO> items;

    public OrderDetailDTO() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<CartItemsDTO> getItems() {
        return items;
    }

    public void setItems(List<CartItemsDTO> items) {
        this.items = items;
    }
}