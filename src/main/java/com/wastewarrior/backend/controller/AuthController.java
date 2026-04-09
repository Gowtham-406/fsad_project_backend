package com.wastewarrior.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> payload) {
        String role = payload.get("role");
        
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("role", role);
        
        return ResponseEntity.ok(response);
    }
}
