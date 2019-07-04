package com.xia.demo.userservicedemo.web;

import com.xia.demo.userservicedemo.pojo.User;
import com.xia.demo.userservicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryUserById(@PathVariable("id") Integer id) {
        return userService.queryUserById(id);
    }

}
