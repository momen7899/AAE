package com.momen.aee.products.product;

import com.momen.aee.products.category.Category;
import com.momen.aee.products.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = Product.TABLE_NAME)
@Getter
@Setter
public class Product extends BaseEntity {
    public static final String TABLE_NAME = "products";

    @Column(name = "name", nullable = false, updatable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "active", nullable = false)
    private boolean active;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    private Category category;
}
