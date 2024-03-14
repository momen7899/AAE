package com.momen.aee.orders.voucher;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VoucherMapper {
    Voucher toVoucher(VoucherRequestDTO voucherRequestDTO);

    VoucherResponseDTO toVoucherResponse(Voucher save);
}
