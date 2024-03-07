package com.momen.aee.orders.order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long>, CrudRepository<Order, Long> {
    Iterable<Order> findAllByUser(long userId);
}
