package com.momen.aee.orders.order_item;

import lombok.Data;

@Data
public class OrderItemRequestDTO {
    private Long product;
    private Long price;
    private Long discount;
    private Long orderId;
}
