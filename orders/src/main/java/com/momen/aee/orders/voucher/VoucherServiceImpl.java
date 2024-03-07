package com.momen.aee.orders.voucher;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class VoucherServiceImpl implements VoucherService {

    private final VoucherRepository repository;

    @Override
    public Voucher save(Voucher voucher) {
        return repository.save(voucher);
    }

    @Override
    public void delete(long voucherId) {
        repository.delete(findById(voucherId));
    }

    @SneakyThrows
    @Override
    public Voucher findById(long voucherId) {
        Optional<Voucher> voucherOptional = repository.findById(voucherId);
        return voucherOptional.orElseThrow(() -> new Exception("Voucher with id not found"));
    }
}
