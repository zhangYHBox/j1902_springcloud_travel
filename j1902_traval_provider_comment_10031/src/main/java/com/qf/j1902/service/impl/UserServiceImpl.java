package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2019/7/20.
 */
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
}
