package com.arilsondev.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@DynamoDBDocument
public class Product {

    @DynamoDBAttribute
    private Integer productId;

    @DynamoDBAttribute
    private String productName;
}
