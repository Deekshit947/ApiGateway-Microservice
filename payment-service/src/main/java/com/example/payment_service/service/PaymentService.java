package com.example.payment_service.service;

import com.example.payment_service.model.PaymentRequest;
import com.example.payment_service.model.PaymentResponse;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentResponse processPayment(PaymentRequest request) {

        // Simulate processing
        return new PaymentResponse("SUCCESS", request.getAmount());
    }
}
