package com.sample.service;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status) {
        System.out.println("Checkout Method of ShoppingCart");
    }
}
