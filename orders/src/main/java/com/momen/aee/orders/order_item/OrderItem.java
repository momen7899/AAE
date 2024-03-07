package com.momen.aee.orders.order_item;

import com.momen.aee.orders.common.BaseEntity;
import com.momen.aee.orders.order.Order;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = OrderItem.TABLE_NAME)
@Getter
@Setter
public class OrderItem extends BaseEntity {
    static final String TABLE_NAME = "order_items";

    @Column(name = "product_id", nullable = false, updatable = false)
    private Long product;

    @Column(name = "price", nullable = false, updatable = false)
    private Long price;

    @Column(name = "discount", nullable = false, updatable = false)
    private Long discount;

    @ManyToOne
    private Order order;
}
