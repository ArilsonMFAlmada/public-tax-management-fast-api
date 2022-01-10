package com.arilsondev.consumer;

import com.arilsondev.model.Order;
import com.arilsondev.model.OrderStatus;
import com.arilsondev.repository.OrderRepository;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private OrderRepository orderRepository;

    public OrderConsumer(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @SqsListener("payment-updates")
    public void consume(OrderStatus orderStatus){
        System.out.println("Received order status for orderId... " +orderStatus.getOrderId());
        Order order = orderRepository.getOrderById(orderStatus.getOrderId());
        order.setOrderStatus(orderStatus.getOrderState().name());
        orderRepository.save(order);
    }
}
