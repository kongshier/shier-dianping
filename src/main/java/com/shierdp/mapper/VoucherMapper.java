package com.shierdp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shierdp.entity.Voucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shier
 */
public interface VoucherMapper extends BaseMapper<Voucher> {

    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
