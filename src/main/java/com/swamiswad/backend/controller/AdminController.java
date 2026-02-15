package com.swamiswad.backend.controller;

import com.swamiswad.backend.model.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*") // temporary, we tighten later
public class AdminController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        String adminUsername = "admin";
        String adminPassword = "1234"; // change later

        if (request.getUsername().equals(adminUsername) &&
                request.getPassword().equals(adminPassword)) {

            return ResponseEntity.ok("Login successful");
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid credentials");
    }
}

