package com.momen.aee.orders.order;

import com.momen.aee.orders.order_item.OrderItemService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;
    private final OrderItemService orderItemService;

    @Override
    public Order save(Order order) {
        // TODO: VALIDATE USER
        order.setUser(1L);
        Order savedOrder = repository.save(order);
        orderItemService.saveOrderItems(order.getOrderItems(), order);
        return savedOrder;
    }

    @Override
    public void delete(long id) {
        repository.delete(findById(id));
    }


    @SneakyThrows
    @Override
    public Order findById(long id) {
        Optional<Order> optionalOrder = repository.findById(id);
        return optionalOrder.orElseThrow(() -> new Exception("Order with id not found"));
    }

    @Override
    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }

    @Override
    public List<Order> findAllByUser(long userId) {
        return (List<Order>) repository.findAllByUser(userId);
    }
}
