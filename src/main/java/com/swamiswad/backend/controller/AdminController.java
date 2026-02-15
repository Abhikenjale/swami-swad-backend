package com.swamiswad.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = {
        "http://localhost:3000",
        "https://swami-swad-frontend.vercel.app"
})
@RestController
@RequestMapping("/admin")
public class AdminController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Simple password check
        if ("admin".equals(username) && "admin123".equals(password)) {
            return ResponseEntity.ok(Map.of(
                    "status", "success",
                    "message", "Login successful"
            ));
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(Map.of("status", "error", "message", "Invalid credentials"));
    }
}
