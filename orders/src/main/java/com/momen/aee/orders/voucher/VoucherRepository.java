package com.momen.aee.orders.voucher;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepository extends PagingAndSortingRepository<Voucher, Long>, CrudRepository<Voucher, Long> {
}
