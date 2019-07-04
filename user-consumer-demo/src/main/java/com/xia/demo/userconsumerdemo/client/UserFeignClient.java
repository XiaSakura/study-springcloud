package com.xia.demo.userconsumerdemo.client;

import com.xia.demo.userconsumerdemo.client.impl.UserFeignClientFallback;
import com.xia.demo.userconsumerdemo.config.FeignConfig;
import com.xia.demo.userconsumerdemo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * - 首先这是一个接口，Feign会通过动态代理，帮我们生成实现类。这点跟mybatis的mapper很像
 * - `@FeignClient`，声明这是一个Feign客户端，类似`@Mapper`注解。同时通过`value`属性指定服务名称
 * - 接口中的定义方法，完全采用SpringMVC的注解，Feign会根据注解帮我们生成URL，并访问获取结果
 */
@FeignClient(value = "user-service", fallback = UserFeignClientFallback.class, configuration = FeignConfig.class)
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    public User queryUserById(@PathVariable("id") Integer id);

}
