package com.arilsondev.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.arilsondev.model.Payment;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    private DynamoDBMapper dynamoDBMapper;

    public PaymentRepository(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Payment save(Payment payment) {
        dynamoDBMapper.save(payment);
        return payment;
    }
}
