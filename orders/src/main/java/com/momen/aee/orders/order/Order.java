package com.momen.aee.orders.order;

import com.momen.aee.orders.common.BaseEntity;
import com.momen.aee.orders.order_item.OrderItem;
import com.momen.aee.orders.voucher.Voucher;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = Order.TABLE_NAME)
@Getter
@Setter
public class Order extends BaseEntity {
    static final String TABLE_NAME = "orders";

    @Column(name = "user_id", nullable = false, updatable = false)
    private Long user;

    @Column(name = "total_price", nullable = false)
    private Long totalPrice;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
    private Voucher voucher;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
}
