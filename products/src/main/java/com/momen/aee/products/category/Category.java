package com.momen.aee.products.category;


import com.momen.aee.products.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = Category.TABLE_NAME)
@Data
public class Category extends BaseEntity {
    public static final String TABLE_NAME = "category_tb";

    @Column(name = "name")
    private String name;

    @ManyToOne
    @Column(name = "parent")
    private Category parent;

    @OneToMany
    List<Category> childrens;

}
