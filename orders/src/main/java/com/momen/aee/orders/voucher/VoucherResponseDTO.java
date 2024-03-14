package com.momen.aee.orders.voucher;

import com.momen.aee.orders.common.BaseResponseDTO;
import lombok.Data;

@Data
public class VoucherResponseDTO extends BaseResponseDTO {
    public String code;
    public int orderId;
}
