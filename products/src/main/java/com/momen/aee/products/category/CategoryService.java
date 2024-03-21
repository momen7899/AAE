package com.momen.aee.products.category;


import java.util.List;

interface CategoryService {
    Category save(Category category);

    void delete(long id);

    Category findById(long id);

    List<Category> findAll();

    List<Category> findAllChildrenByParentId(long parentId);
}
