package com.momen.aee.products.product;

import com.momen.aee.products.common.errors.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public Product update(Product product) {
        Product savedBefore = findById(product.getId());
        savedBefore.setActive(product.isActive());
        savedBefore.setPrice(product.getPrice());
        savedBefore.setQuantity(product.getQuantity());
        savedBefore.setCategory(product.getCategory());
        return repository.save(savedBefore);
    }

    @Override
    public void delete(long id) {
        repository.delete(findById(id));
    }

    @Override
    public Product findById(long id) {
        Optional<Product> optionalProduct = repository.findById(id);
        return optionalProduct.orElseThrow(() -> new NotFoundException(Product.class.getName(), id));
    }

    @Override
    public List<Product> findAllByCategoryId(long categoryId) {
        return (List<Product>) repository.findAllByCategoryId(categoryId);
    }
}
