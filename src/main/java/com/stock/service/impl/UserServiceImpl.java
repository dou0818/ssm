package com.stock.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.stock.mapper.UserMapper;
import com.stock.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

}
