package com.xia.demo.userconsumerdemo.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String loginacct;
    private String userpswd;
    private String username;
    private String email;
    private String createtime;

}
