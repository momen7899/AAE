package com.momen.aee.orders.order;

import com.momen.aee.orders.common.BaseResponseDTO;
import com.momen.aee.orders.order_item.OrderItemResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponseDTO extends BaseResponseDTO {
    private Long totalPrice;

    private Long voucherId;

    private List<OrderItemResponseDTO> orderItems;

}
