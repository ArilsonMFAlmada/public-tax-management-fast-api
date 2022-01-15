package com.arilsondev.publisher;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.arilsondev.model.OrderStatus;
import com.arilsondev.model.Payment;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentPublisher {

    private QueueMessagingTemplate queueMessagingTemplate;

    public PaymentPublisher(AmazonSQSAsync amazonSQSAsync) {
        this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSQSAsync);
    }

    public void publish(Payment payment) {
        System.out.println("Publishing paymentId: " +payment.getPaymentId());
        queueMessagingTemplate.convertAndSend("https://sqs.us-east-1.amazonaws.com/618830971158/restaurant-updates", payment);
    }

    public void publish(OrderStatus orderStatus) {
        System.out.println("Publishing orderStatus: " +orderStatus.getOrderId());
        queueMessagingTemplate.convertAndSend("https://sqs.us-east-1.amazonaws.com/618830971158/order-updates", orderStatus);
    }
}
