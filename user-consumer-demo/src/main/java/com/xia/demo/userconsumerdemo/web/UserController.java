package com.xia.demo.userconsumerdemo.web;

import com.xia.demo.userconsumerdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User queryUserById(@PathVariable("id") Integer id){
        String url="http://localhost:8080/user/"+id;
        return restTemplate.getForObject(url,User.class);
    }

}
