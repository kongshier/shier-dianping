package com.shierdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shierdp.dto.LoginFormDTO;
import com.shierdp.dto.Result;
import com.shierdp.entity.User;

import javax.servlet.http.HttpSession;

/**
 * @author shier
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
