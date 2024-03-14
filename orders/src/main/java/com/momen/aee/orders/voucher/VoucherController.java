package com.momen.aee.orders.voucher;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vouchers/")
@AllArgsConstructor
public class VoucherController {

    private final VoucherService service;
    private final VoucherMapper mapper;

    @PostMapping()
    public VoucherResponseDTO save(@RequestBody VoucherRequestDTO voucher) {
        return mapper.toVoucherResponse(service.save(mapper.toVoucher(voucher)));
    }


    @DeleteMapping("{id}/")
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("{id}/")
    VoucherResponseDTO findById(@PathVariable Long id) {
        return mapper.toVoucherResponse(service.findById(id));
    }

}
