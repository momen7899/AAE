package com.momen.aee.orders.order_item;


import com.momen.aee.orders.voucher.Voucher;

public interface OrderItemService {
    OrderItem save(OrderItem orderItem);

    void delete(long orderItemId);

    OrderItem findById(long orderItemId);
}
