package com.momen.aee.products.category;

import lombok.Data;

@Data
public class CategoryRequestDTO {

    private String name;

    private long parentId;

}
