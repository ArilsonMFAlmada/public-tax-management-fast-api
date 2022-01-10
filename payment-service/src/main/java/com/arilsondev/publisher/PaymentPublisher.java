package com.arilsondev.publisher;

import com.arilsondev.model.OrderStatus;
import com.arilsondev.model.Payment;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentPublisher {

    private QueueMessagingTemplate queueMessagingTemplate;

    public PaymentPublisher(QueueMessagingTemplate queueMessagingTemplate) {
        this.queueMessagingTemplate = queueMessagingTemplate;
    }

    public void publish(Payment payment) {
        System.out.println("Publishing paymentId: " +payment.getPaymentId());
        queueMessagingTemplate.convertAndSend("restaurant-updates", payment);
    }

    public void publish(OrderStatus orderStatus) {
        System.out.println("Publishing orderStatus: " +orderStatus.getOrderId());
        queueMessagingTemplate.convertAndSend("order-updates", orderStatus);
    }
}
