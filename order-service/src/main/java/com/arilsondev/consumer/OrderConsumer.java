package com.arilsondev.consumer;

import com.arilsondev.repository.OrderRepository;
import com.arilsondev.model.Order;
import com.arilsondev.model.OrderStatus;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class OrderConsumer {

    private final OrderRepository orderRepository;

    public OrderConsumer(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @SqsListener("https://sqs.us-east-1.amazonaws.com/618830971158/order-updates")
    public void consume(OrderStatus orderStatus) {
        System.out.println("Received order status for orderId... " + orderStatus.getOrderId());
        Order order = orderRepository.getOrderById(orderStatus.getOrderId());
        order.setOrderStatus(orderStatus.getOrderState().name());
        order.setUpdatedTimestamp(new Timestamp(System.currentTimeMillis()).toString());
        orderRepository.save(order);
    }
}
