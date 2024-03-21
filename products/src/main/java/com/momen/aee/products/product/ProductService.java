package com.momen.aee.products.product;

import java.util.List;

public interface ProductService {
    Product save(Product product);

    Product update(Product product);

    void delete(long id);

    Product findById(long id);

    List<Product> findAllByCategoryId(long categoryId);
}
