package com.example.order_service.model;

public class PaymentResponse {

    private String status;
    private double amount;

    public PaymentResponse() {}

    public PaymentResponse(String status, double amount) {
        this.status = status;
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

