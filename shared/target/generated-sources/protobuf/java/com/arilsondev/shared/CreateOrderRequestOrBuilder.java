// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.arilsondev.shared;

public interface CreateOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.arilsondev.shared.CreateOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 customerId = 1;</code>
   */
  int getCustomerId();

  /**
   * <code>int32 sellerId = 2;</code>
   */
  int getSellerId();

  /**
   * <code>.com.arilsondev.shared.Product product = 3;</code>
   */
  boolean hasProduct();
  /**
   * <code>.com.arilsondev.shared.Product product = 3;</code>
   */
  com.arilsondev.shared.Product getProduct();
  /**
   * <code>.com.arilsondev.shared.Product product = 3;</code>
   */
  com.arilsondev.shared.ProductOrBuilder getProductOrBuilder();

  /**
   * <code>.com.arilsondev.shared.CreateOrderRequest.PaymentMethod paymentMethod = 4;</code>
   */
  int getPaymentMethodValue();
  /**
   * <code>.com.arilsondev.shared.CreateOrderRequest.PaymentMethod paymentMethod = 4;</code>
   */
  com.arilsondev.shared.CreateOrderRequest.PaymentMethod getPaymentMethod();

  /**
   * <code>string deliveryLocation = 5;</code>
   */
  java.lang.String getDeliveryLocation();
  /**
   * <code>string deliveryLocation = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeliveryLocationBytes();
}