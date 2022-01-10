package com.arilsondev.mapper;

import com.arilsondev.model.Order;
import com.arilsondev.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentMapper {

    public Payment convert(Order orderResponse) {
        return Payment
                .builder()
                .orderId(orderResponse.getOrderId())
                .costumerId(orderResponse.getCustomerId())
                .sellerId(orderResponse.getSellerId())
                .paymentMethod(orderResponse.getPaymentMethod())
                .paymentStatus("SUCCESS")
                .build();
    }
}
