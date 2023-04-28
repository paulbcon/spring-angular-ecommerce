package com.paulnc.ecommerce.service;

import com.paulnc.ecommerce.dto.PaymentInfo;
import com.paulnc.ecommerce.dto.Purchase;
import com.paulnc.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
