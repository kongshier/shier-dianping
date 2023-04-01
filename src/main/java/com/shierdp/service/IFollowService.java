package com.shierdp.service;

import com.shierdp.dto.Result;
import com.shierdp.entity.Follow;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * HashMap
 * @author shier
 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
