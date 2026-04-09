
package com.example.sampleapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public Map<String, String> getUser() {
        Map<String, String> response = new HashMap<>();
        response.put("employeeNo", "82210667"); // ← 본인 사번으로 변경
        return response;
    }
}
