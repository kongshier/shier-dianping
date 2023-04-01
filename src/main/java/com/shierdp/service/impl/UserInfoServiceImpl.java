package com.shierdp.service.impl;

import com.shierdp.entity.UserInfo;
import com.shierdp.mapper.UserInfoMapper;
import com.shierdp.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author shier
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
