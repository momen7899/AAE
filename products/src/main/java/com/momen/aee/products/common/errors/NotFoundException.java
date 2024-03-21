package com.momen.aee.products.common.errors;

public class NotFoundException extends RuntimeException {


    public NotFoundException(String entityName, Long id) {
        super("Not found " + entityName + " with id " + id);
    }

}
