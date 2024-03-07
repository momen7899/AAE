package com.momen.aee.orders.order_item;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, Long>, CrudRepository<OrderItem, Long> {
}
