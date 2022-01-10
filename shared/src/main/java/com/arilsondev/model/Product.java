package com.arilsondev.model;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@DynamoDBDocument
public class Product implements Serializable{

    @DynamoDBAttribute
    private Integer productId;

    @DynamoDBAttribute
    private String productName;
}
