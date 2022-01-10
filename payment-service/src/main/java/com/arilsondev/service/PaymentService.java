package com.arilsondev.service;

import com.arilsondev.mapper.PaymentMapper;
import com.arilsondev.model.Order;
import com.arilsondev.model.OrderState;
import com.arilsondev.model.OrderStatus;
import com.arilsondev.model.Payment;
import com.arilsondev.publisher.PaymentPublisher;
import com.arilsondev.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentMapper paymentMapper;
    private PaymentRepository paymentRepository;
    private PaymentPublisher paymentPublisher;


    public PaymentService(PaymentMapper paymentMapper, PaymentRepository paymentRepository, PaymentPublisher paymentPublisher) {
        this.paymentMapper = paymentMapper;
        this.paymentRepository = paymentRepository;
        this.paymentPublisher = paymentPublisher;
    }

    public void send(Order orderResponse) {
        Payment payment = paymentMapper.convert(orderResponse);
        paymentRepository.save(payment);
        paymentPublisher.publish(payment);
        OrderStatus orderStatus = OrderStatus
                .builder()
                .orderState(OrderState.ORDER_PAID)
                .orderId(orderResponse.getOrderId())
                .message("Successfully paid by " + payment.getPaymentMethod())
                .build();
        paymentPublisher.publish(orderStatus);
    }
}
