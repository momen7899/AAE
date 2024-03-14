package com.momen.aee.orders.order_item;


import com.momen.aee.orders.order.Order;

import java.util.List;

public interface OrderItemService {
    OrderItem save(OrderItem orderItem);

    void saveOrderItems(List<OrderItem> orderItems, Order order);

    void delete(long orderItemId);

    OrderItem findById(long orderItemId);
}
