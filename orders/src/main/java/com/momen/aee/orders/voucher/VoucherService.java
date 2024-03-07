package com.momen.aee.orders.voucher;


public interface VoucherService {
    Voucher save(Voucher voucher);

    void delete(long voucherId);

    Voucher findById(long voucherId);
}
