package com.xia.demo.userservicedemo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user")
@Data
public class User {
    /**
     * t_user
     * `id` int(11) NOT NULL AUTO_INCREMENT,
     * `loginacct` varchar(255) NOT NULL,
     * `userpswd` char(32) NOT NULL,
     * `username` varchar(255) NOT NULL,
     * `email` varchar(255) NOT NULL,
     * `createtime` char(19) DEFAULT NULL,
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String loginacct;
    private String userpswd;
    private String username;
    private String email;
    private String createtime;


}
