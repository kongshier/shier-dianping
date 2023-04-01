package com.shierdp.service;

import com.shierdp.dto.Result;
import com.shierdp.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author shier
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
