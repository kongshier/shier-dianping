package com.shierdp.service;

import com.shierdp.dto.Result;
import com.shierdp.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author shier
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
}
