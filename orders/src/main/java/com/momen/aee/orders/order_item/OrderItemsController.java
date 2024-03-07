package com.momen.aee.orders.order_item;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order-items/")
@AllArgsConstructor
public class OrderItemsController {

    private final OrderItemService service;

    @PostMapping()
    OrderItem save(@RequestBody OrderItem orderItems) {
        return service.save(orderItems);
    }


    @DeleteMapping("{id}/")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
