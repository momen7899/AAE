package com.momen.aee.orders.order_item;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItem toOrderItem(OrderItemRequestDTO requestDTO);

    OrderItemResponseDTO toResponse(OrderItem orderItem);
}
