package com.momen.aee.orders.order;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders/")
@AllArgsConstructor
public class OrderController {

    private final OrderService service;
    private final OrderMapper mapper;

    @PostMapping()
    OrderResponseDTO save(@RequestBody OrderRequestDTO order) {
        return mapper.toResponse(service.save(mapper.toOrder(order)));
    }


    @DeleteMapping("{id}/")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("{id}/")
    OrderResponseDTO findById(@PathVariable Long id) {
        return mapper.toResponse(service.findById(id));
    }


    @GetMapping()
    List<OrderResponseDTO> all() {
        return mapper.toResponses(service.findAll());
    }

}
