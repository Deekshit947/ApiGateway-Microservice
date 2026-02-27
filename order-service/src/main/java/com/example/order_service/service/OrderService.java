package com.example.order_service.service;

import com.example.order_service.model.PaymentRequest;
import com.example.order_service.model.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public PaymentResponse createOrder(double amount) {

        String paymentUrl = "http://localhost:8081/payment/pay";

        PaymentRequest request = new PaymentRequest(amount);

        return restTemplate.postForObject(
                paymentUrl,
                request,
                PaymentResponse.class
        );
    }
}

