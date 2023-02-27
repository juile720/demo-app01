package com.example.demo.service;

import com.example.demo.feign.UserServiceFeignClient;
import com.example.demo.repository.BankRepository;
import com.example.demo.util.BeanUtilWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BankService {
    private final BankRepository repo;
    private final UserServiceFeignClient userServiceFeignClient;

    public List<Map> retrieveAllBank(){
        List<Map> list = repo.findAll().stream()
                .map( it ->{
                        return BeanUtilWrapper.object2map(it);
                  })
                .collect(Collectors.toList());
        return list;
    }

    public String helloUser(String userName) {
        return userServiceFeignClient.helloName(userName);
    }


}
