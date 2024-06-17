package com.lune.loose_coupling.payment;

public interface PaymentProcessor {

    void processPayment(double amount);
}