package com.arilsondev.service;

import com.arilsondev.mapper.OrderMapper;
import com.arilsondev.publisher.OrderPublisher;
import com.arilsondev.repository.OrderRepository;
import com.arilsondev.model.Order;
import com.arilsondev.shared.CreateOrderRequest;
import com.arilsondev.shared.GetOrderRequest;
import com.arilsondev.shared.OrderResponse;
import com.arilsondev.shared.OrderServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderRepository orderRepository;

    private OrderPublisher orderPublisher;

    @Override
    public void createOrder(CreateOrderRequest request, StreamObserver<OrderResponse> responseObserver) {

        //Convert to dynamoDB Pojo
        Order order = orderMapper.convert(request);
        //Persist to DynamoDB
        orderRepository.save(order);
        //Publish to SQS
        orderPublisher.publish(order);
        //Convert to Response
        OrderResponse orderResponse = orderMapper.convert(order);
        //Build the gRPC
        responseObserver.onNext(orderResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getOrder(GetOrderRequest request, StreamObserver<OrderResponse> responseObserver) {

        Order oderById = orderRepository.getOrderById(request.getOrderId());

        OrderResponse orderResponse = orderMapper.convert(oderById);

        responseObserver.onNext(orderResponse);
        responseObserver.onCompleted();
    }
}
