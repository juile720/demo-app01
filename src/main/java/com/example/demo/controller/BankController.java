package com.example.demo.controller;

import com.example.demo.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class BankController {

    private final BankService service;

    @GetMapping("/api/bank")
    List<Map> all() {

        return service.retrieveAllBank();
    }

    @PostMapping("/api/test")
    String HelloUser(@RequestParam String userName) {
        return service.helloUser(userName);
    }


}
