package com.momen.aee.orders.order;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders/")
@AllArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping()
    Order save(@RequestBody Order order) {
        return service.save(order);
    }


    @DeleteMapping("{id}/")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("{id}/")
    void findById(@PathVariable Long id) {
        service.findById(id);
    }


    @GetMapping()
    List<Order> all() {
        return service.findAll();
    }

}
