package com.momen.aee.orders.order_item;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepository repository;

    @Override
    public OrderItem save(OrderItem orderItem) {
        return repository.save(orderItem);
    }

    @Override
    public void delete(long orderItemId) {
        repository.delete(findById(orderItemId));
    }

    @SneakyThrows
    @Override
    public OrderItem findById(long orderItemId) {
        Optional<OrderItem> orderItemOptional = repository.findById(orderItemId);
        return orderItemOptional.orElseThrow(() -> new Exception("OrderItem with id not found"));
    }

}
