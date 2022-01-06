package com.java17.gatewaydb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test-db")
public class GatewayDbController {

    @GetMapping("/get-response")
    public String getTesResponse() {
        return "It's working";
    }

    @GetMapping("get-admin-response")
    public String getAdminResponse() {
        return "You are administrator if you see this";
    }
}
