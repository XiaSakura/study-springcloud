package com.xia.demo.userconsumerdemo.client.impl;

import com.xia.demo.userconsumerdemo.client.UserFeignClient;
import com.xia.demo.userconsumerdemo.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("用户查询异常");
        return user;
    }
}
