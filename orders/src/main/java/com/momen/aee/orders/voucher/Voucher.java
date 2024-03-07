package com.momen.aee.orders.voucher;

import com.momen.aee.orders.common.BaseEntity;
import com.momen.aee.orders.order.Order;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = Voucher.TABLE_NAME)
@Data
public class Voucher extends BaseEntity {
    static final String TABLE_NAME = "vouchers";


    @Column(name = "code", unique = true, nullable = false, updatable = false)
    private String code = "";

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order;
}
