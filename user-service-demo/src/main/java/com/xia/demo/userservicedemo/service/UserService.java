package com.xia.demo.userservicedemo.service;

import com.xia.demo.userservicedemo.mapper.UserMapper;
import com.xia.demo.userservicedemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
