package com.arilsondev.publisher;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.arilsondev.model.Order;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class OrderPublisher {

    private final QueueMessagingTemplate queueMessagingTemplate;

    public OrderPublisher(AmazonSQSAsync amazonSQSAsync) {
        this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSQSAsync);
    }

    public void publish(Order order) {
        System.out.println("Publishing orderId: " + order.getOrderId());
        queueMessagingTemplate.convertAndSend("https://sqs.us-east-1.amazonaws.com/618830971158/payment-updates", order);
    }
}
