package com.momen.aee.products.category;

import com.momen.aee.products.common.BaseResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class CategoryResponseDTO extends BaseResponseDTO {
    private String name;
    private long parentId;
    private List<CategoryResponseDTO> childList;
}
