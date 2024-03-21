package com.momen.aee.products.category;


import com.momen.aee.products.common.BaseEntity;
import com.momen.aee.products.product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = Category.TABLE_NAME)
@Getter
@Setter
public class Category extends BaseEntity {
    public static final String TABLE_NAME = "category_tb";

    @Column(name = "name", nullable = false, updatable = false)
    private String name;

    @ManyToOne
    private Category parent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Category> childList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
}
