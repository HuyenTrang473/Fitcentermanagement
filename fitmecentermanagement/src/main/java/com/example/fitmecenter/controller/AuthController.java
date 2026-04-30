package com.example.fitmecenter.controller;

import com.example.fitmecenter.dto.LoginRequest;
import com.example.fitmecenter.dto.LoginResponse;
import com.example.fitmecenter.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody LoginRequest request
    ) {

        return authService.login(
                request.getEmail(),
                request.getMatKhau()
        );
    }
}