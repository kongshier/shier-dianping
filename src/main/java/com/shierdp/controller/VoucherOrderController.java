package com.shierdp.controller;


import com.shierdp.dto.Result;
import com.shierdp.service.IVoucherOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author shier
 */
@RestController
@CrossOrigin(origins = {"http://localhost:8080/"}, allowCredentials = "true")
@RequestMapping("/voucher-order")
public class VoucherOrderController {

    @Resource
    private IVoucherOrderService voucherOrderService;

    @PostMapping("seckill/{id}")
    public Result seckillVoucher(@PathVariable("id") Long voucherId) {
        return voucherOrderService.seckillVoucher(voucherId);
    }
}
