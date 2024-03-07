package com.momen.aee.orders.order;

import java.util.List;

public interface OrderService {

    Order save(Order order);

    void delete(long id);

    Order findById(long id);

    List<Order> findAll();

    List<Order> findAllByUser(long userId);
}
