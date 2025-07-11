package com.example.assetManagementReact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.assetManagementReact.entity.User;
import com.example.assetManagementReact.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000/")
public class AuthController {

    @Autowired
    private UserService userService;

    // ✅ Register a new user
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        User saved = userService.register(user);
        return ResponseEntity.ok(saved);
    }

    // ✅ Login an existing user
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        User found = userService.login(user.getEmail(), user.getPassword());

        if (found != null) {
            // Only return needed fields
            return ResponseEntity.ok(new LoginResponse(found.getEmail(), found.getRole()));
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    // ✅ Inner class for response
    static class LoginResponse {
        private String email;
        private String role;

        public LoginResponse(String email, String role) {
            this.email = email;
            this.role = role;
        }

        public String getEmail() {
            return email;
        }

        public String getRole() {
            return role;
        }
    }
}
