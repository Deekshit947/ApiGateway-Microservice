package com.example.order_service.controller;

import com.example.order_service.model.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.order_service.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public String createOrder(@RequestParam double amount) {

        PaymentResponse paymentResponse =
                orderService.createOrder(amount);

        return "Order Created. Payment Status: "
                + paymentResponse.getStatus();
    }

    @GetMapping("/status")
    public String status() {
        return "Order Service is running";
    }

    @GetMapping("/")
    public String home() {
        return "Order Service Running";
    }
}

