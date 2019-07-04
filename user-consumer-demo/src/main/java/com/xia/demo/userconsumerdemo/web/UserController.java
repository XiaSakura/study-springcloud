package com.xia.demo.userconsumerdemo.web;

import com.xia.demo.userconsumerdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 利用discoveryClient 原生的从eureka服务器里面获取实例
     * @param id
     * @return
     */
   /* @GetMapping("/{id}")
    public User queryUserById(@PathVariable("id") Integer id){
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        //因为只有一个所以直接get(0)
        ServiceInstance serviceInstance = instances.get(0);
        String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();
        String url="http://"+host+":"+port+"/user/"+id;
        return restTemplate.getForObject(url,User.class);
    }*/

    /**
     * 利用ribbon 负载均衡实现调用
     * 修改调用方式，不再手动获取ip和端口，而是直接通过服务名称调用
     * 在restTemplate上面有@LoadBalanced注解 注入了ribbon 默认是轮询
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User queryUserById(@PathVariable("id") Integer id){
        String url="http://user-service/user/"+id;
        return restTemplate.getForObject(url,User.class);
    }

}
