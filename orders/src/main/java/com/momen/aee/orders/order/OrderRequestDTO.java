package com.momen.aee.orders.order;

import com.momen.aee.orders.order_item.OrderItemRequestDTO;
import com.momen.aee.orders.voucher.Voucher;
import lombok.Data;

import java.util.List;

@Data
public class OrderRequestDTO {

    private Long totalPrice;

    private Long voucherId;

    private List<OrderItemRequestDTO> orderItems;
}
