package com.momen.aee.orders.voucher;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vouchers/")
@AllArgsConstructor
public class VoucherController {

    private final VoucherService service;

    @PostMapping()
    Voucher save(@RequestBody Voucher voucher) {
        return service.save(voucher);
    }


    @DeleteMapping("{id}/")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("{id}/")
    void findById(@PathVariable Long id) {
        service.findById(id);
    }

}
