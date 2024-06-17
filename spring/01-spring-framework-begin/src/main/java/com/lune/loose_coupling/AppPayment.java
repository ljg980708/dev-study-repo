package com.lune.loose_coupling;

import com.lune.loose_coupling.payment.CreditCardProcessor;
import com.lune.loose_coupling.payment.PayPalProcessor;
import com.lune.loose_coupling.payment.PaymentProcessor;
import com.lune.loose_coupling.payment.PaymentService;

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
