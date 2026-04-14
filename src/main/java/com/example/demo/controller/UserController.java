package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import org.springframework.http.ResponseEntity;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public ResponseEntity<Map<String, String>> test(
            @RequestHeader("Authorization") String token) {

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        return ResponseEntity.ok(map);
    }
}