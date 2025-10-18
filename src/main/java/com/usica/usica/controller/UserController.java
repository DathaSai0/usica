package com.usica.usica.controller;

import com.usica.usica.Dto.ApiResponse;
import com.usica.usica.model.User;
import com.usica.usica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse<User>> createUser(@RequestBody User user){
        User userRes = userService.createUser(user);
        ApiResponse<User> response = new ApiResponse<>("User Created Successfully" , 109 , userRes);
        return ResponseEntity.ok().body(response);
    }
}
