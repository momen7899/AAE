package com.momen.aee.orders.order;

import com.momen.aee.orders.common.BaseResponseDTO;
import com.momen.aee.orders.order_item.OrderItemResponseDTO;
import com.momen.aee.orders.voucher.Voucher;
import lombok.Data;

import java.util.List;

@Data
public class OrderResponseDTO extends BaseResponseDTO {
    private Long totalPrice;

    private Voucher voucherId;

    private List<OrderItemResponseDTO> orderItems;

}
