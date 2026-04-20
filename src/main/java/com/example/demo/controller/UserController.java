package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private static final String EMPLOYEE_ID = "82210667";

    @GetMapping("/user")
    public Map<String, String> getUser() {
        Map<String, String> map = new HashMap<>();
        map.put("employeeId", EMPLOYEE_ID);
        return map;
    }

}
