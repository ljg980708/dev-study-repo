package com.lune.spring_framework_begin;

import com.lune.payment.CreditCardProcessor;
import com.lune.payment.PayPalProcessor;
import com.lune.payment.PaymentProcessor;
import com.lune.payment.PaymentService;

public class AppPayment {

    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentService creditCardPaymentService = new PaymentService(creditCardProcessor);
        creditCardPaymentService.makePayment(100.0);

        PaymentProcessor payPalProcessor = new PayPalProcessor();
        PaymentService payPalPaymentService = new PaymentService(payPalProcessor);
        payPalPaymentService.makePayment(200.0);
    }
}
