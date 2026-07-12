package com.cognizant.jwthandson.controller;

import com.cognizant.jwthandson.model.JwtRequest;
import com.cognizant.jwthandson.model.JwtResponse;
import com.cognizant.jwthandson.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest request) {

        if ("user".equals(request.getUsername())
                && "pwd".equals(request.getPassword())) {

            String token = JwtUtil.generateToken(request.getUsername());
            return new JwtResponse(token);
        }

        throw new RuntimeException("Invalid Username or Password");
    }
}