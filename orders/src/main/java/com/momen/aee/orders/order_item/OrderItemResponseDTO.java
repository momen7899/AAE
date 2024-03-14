package com.momen.aee.orders.order_item;

import com.momen.aee.orders.common.BaseResponseDTO;
import lombok.Data;

@Data
public class OrderItemResponseDTO extends BaseResponseDTO {
    private Long product;
    private Long price;
    private Long discount;
}
