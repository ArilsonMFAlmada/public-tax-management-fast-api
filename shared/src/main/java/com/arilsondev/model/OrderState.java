package com.arilsondev.model;

import java.io.Serializable;

public enum OrderState implements Serializable {
    ORDER_PAID,
    ORDER_PREPARED,
    ORDER_DELIVERED,
    ORDER_FAILED
}
