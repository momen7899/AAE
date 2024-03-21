package com.momen.aee.products.category;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories/")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService service;
    private final CategoryMapper mapper;

    @PostMapping()
    public CategoryResponseDTO save(@RequestBody CategoryRequestDTO voucher) {
        return mapper.toCategoryResponse(service.save(mapper.toCategory(voucher)));
    }


    @DeleteMapping("{id}/")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("{id}/")
    public CategoryResponseDTO findById(@PathVariable Long id) {
        return mapper.toCategoryResponse(service.findById(id));
    }

    @GetMapping("")
    public List<CategoryResponseDTO> findAll() {
        return mapper.toCategoryResponses(service.findAll());
    }

    @GetMapping("{parentId}/children/")
    public List<CategoryResponseDTO> findAllChildrenByParentId(@PathVariable long parentId) {
        return mapper.toCategoryResponses(service.findAllChildrenByParentId(parentId));
    }
}
