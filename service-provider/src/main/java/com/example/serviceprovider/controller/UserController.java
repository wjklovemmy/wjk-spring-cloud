package com.example.serviceprovider.controller;

import com.example.serviceprovider.service.UserService;
import com.example.serviceprovider.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findAllUsers")
    public BaseResponse findAllUsers(){
        return userService.findAllUsers();
    }
}
