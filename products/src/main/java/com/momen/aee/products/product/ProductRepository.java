package com.momen.aee.products.product;

import com.momen.aee.products.category.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends PagingAndSortingRepository<Product, Long>, CrudRepository<Product, Long> {

    Iterable<Product> findAllByCategoryId(long categoryId);
}
