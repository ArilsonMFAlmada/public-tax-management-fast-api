// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.arilsondev.shared;

public final class Order {
  private Order() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_arilsondev_shared_CreateOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_arilsondev_shared_CreateOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_arilsondev_shared_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_arilsondev_shared_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_arilsondev_shared_OrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_arilsondev_shared_OrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_arilsondev_shared_GetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_arilsondev_shared_GetOrderRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013order.proto\022\025com.arilsondev.shared\"\203\002\n" +
      "\022CreateOrderRequest\022\022\n\ncustomerId\030\001 \001(\005\022" +
      "\020\n\010sellerId\030\002 \001(\005\022/\n\007product\030\003 \001(\0132\036.com" +
      ".arilsondev.shared.Product\022N\n\rpaymentMet" +
      "hod\030\004 \001(\01627.com.arilsondev.shared.Create" +
      "OrderRequest.PaymentMethod\022\030\n\020deliveryLo" +
      "cation\030\005 \001(\t\",\n\rPaymentMethod\022\n\n\006WALLET\020" +
      "\000\022\017\n\013CREDIT_CARD\020\001\"1\n\007Product\022\021\n\tproduct" +
      "Id\030\001 \001(\005\022\023\n\013productName\030\002 \001(\t\"\347\001\n\rOrderR" +
      "esponse\022\022\n\ncustomerId\030\001 \001(\005\022\020\n\010sellerId\030",
      "\002 \001(\005\022/\n\007product\030\003 \001(\0132\036.com.arilsondev." +
      "shared.Product\022\025\n\rpaymentMethod\030\004 \001(\t\022\030\n" +
      "\020deliveryLocation\030\005 \001(\t\022\017\n\007orderId\030\006 \001(\t" +
      "\022\023\n\013orderStatus\030\007 \001(\t\022\023\n\013createdTime\030\010 \001" +
      "(\t\022\023\n\013updatedTime\030\t \001(\t\"6\n\017GetOrderReque" +
      "st\022\017\n\007orderId\030\001 \001(\t\022\022\n\ncustomerId\030\002 \001(\0052" +
      "\314\001\n\014OrderService\022`\n\013createOrder\022).com.ar" +
      "ilsondev.shared.CreateOrderRequest\032$.com" +
      ".arilsondev.shared.OrderResponse\"\000\022Z\n\010ge" +
      "tOrder\022&.com.arilsondev.shared.GetOrderR",
      "equest\032$.com.arilsondev.shared.OrderResp" +
      "onse\"\000B\031\n\025com.arilsondev.sharedP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_arilsondev_shared_CreateOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_arilsondev_shared_CreateOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_arilsondev_shared_CreateOrderRequest_descriptor,
        new java.lang.String[] { "CustomerId", "SellerId", "Product", "PaymentMethod", "DeliveryLocation", });
    internal_static_com_arilsondev_shared_Product_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_arilsondev_shared_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_arilsondev_shared_Product_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", });
    internal_static_com_arilsondev_shared_OrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_arilsondev_shared_OrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_arilsondev_shared_OrderResponse_descriptor,
        new java.lang.String[] { "CustomerId", "SellerId", "Product", "PaymentMethod", "DeliveryLocation", "OrderId", "OrderStatus", "CreatedTime", "UpdatedTime", });
    internal_static_com_arilsondev_shared_GetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_arilsondev_shared_GetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_arilsondev_shared_GetOrderRequest_descriptor,
        new java.lang.String[] { "OrderId", "CustomerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}