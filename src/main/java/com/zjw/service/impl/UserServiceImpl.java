package com.zjw.service.impl;

import com.zjw.dao.UserMapper;
import com.zjw.model.User;
import com.zjw.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zjw on 2018/6/24.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    public User selectUser(long userId) {
        return this.userMapper.selectByPrimaryKey(1);
    }
}
