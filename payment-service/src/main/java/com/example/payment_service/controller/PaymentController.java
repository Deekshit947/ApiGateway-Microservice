package com.example.payment_service.controller;

import com.example.payment_service.model.PaymentRequest;
import com.example.payment_service.model.PaymentResponse;
import com.example.payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public PaymentResponse makePayment(@RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }

    @GetMapping("/status")
    public String status() {
        return "Payment Service is running";
    }
}
