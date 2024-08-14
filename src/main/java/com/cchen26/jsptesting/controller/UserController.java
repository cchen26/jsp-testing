package com.cchen26.jsptesting.controller;

import com.cchen26.jsptesting.model.GroupUser;
import com.cchen26.jsptesting.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private final GroupUserService groupUserService;

    @Autowired
    public UserController(GroupUserService groupUserService) {
        this.groupUserService = groupUserService;
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody Map<String, String> loginRequest) {
        String email = loginRequest.get("username");
        String password = loginRequest.get("password");

        GroupUser groupUser = groupUserService.loginUser(email, password);

        Map<String, Object> response = new HashMap<>();
        if (groupUser != null) {
            response.put("message", "Login successful");
            response.put("user", groupUser);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("message", "Invalid username or password");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }
    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "login";
    }

}

