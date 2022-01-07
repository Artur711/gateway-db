package com.java17.gatewaydb.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/test")
public class GatewayDbController {

    @GetMapping("/get-response")
    public ResponseEntity<String> getTesResponse() {
        return ok("It's working");
    }

    @GetMapping("get-admin-response")
    public ResponseEntity<String> getAdminResponse() {
        return ok("You are administrator if you see this");
    }
}
