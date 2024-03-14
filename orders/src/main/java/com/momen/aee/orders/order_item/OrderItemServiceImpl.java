package com.momen.aee.orders.order_item;

import com.momen.aee.orders.order.Order;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public void saveOrderItems(List<OrderItem> orderItems, Order order) {
        for (OrderItem item : orderItems) {
            item.setOrder(order);
        }
        repository.saveAll(orderItems);
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
