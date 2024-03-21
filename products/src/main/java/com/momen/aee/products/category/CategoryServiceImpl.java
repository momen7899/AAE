package com.momen.aee.products.category;

import com.momen.aee.products.common.errors.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public void delete(long id) {
        repository.delete(findById(id));
    }

    @Override
    public Category findById(long id) {
        Optional<Category> optionalCategory = repository.findById(id);
        return optionalCategory.orElseThrow(() -> new NotFoundException(Category.class.getName(), id));
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) repository.findAll();
    }

    @Override
    public List<Category> findAllChildrenByParentId(long parentId) {
        return (List<Category>) repository.findAllByParentId(parentId);
    }
}
