package com.momen.aee.orders.order;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    @Override
    public Order save(Order order) {
        // TODO: VALIDATE USER
        return repository.save(order);
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
