package com.arilsondev.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class OrderStatus implements Serializable {

    private String orderId;
    private OrderState orderState;
    private String message;

}
