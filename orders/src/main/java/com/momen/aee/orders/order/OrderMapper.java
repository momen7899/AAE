package com.momen.aee.orders.order;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toOrder(OrderRequestDTO requestDTO);

    OrderResponseDTO toResponse(Order order);

    List<OrderResponseDTO> toResponses(List<Order> orders);
}
