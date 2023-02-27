package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "demo-app02")
public interface UserServiceFeignClient {
    @GetMapping("/users/{userName}")
    String helloName(@PathVariable String userName);
}
