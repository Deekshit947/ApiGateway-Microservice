package com.example.order_service.model;

public class PaymentRequest {

    private double amount;

    public PaymentRequest() {}

    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}


