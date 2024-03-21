package com.momen.aee.products.category;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toCategory(CategoryRequestDTO categoryRequestDTO);

    CategoryResponseDTO toCategoryResponse(Category category);

    List<CategoryResponseDTO> toCategoryResponses(List<Category> categories);
}
