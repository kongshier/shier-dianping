package com.shierdp.service;

import com.shierdp.dto.Result;
import com.shierdp.entity.Voucher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author shier
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
