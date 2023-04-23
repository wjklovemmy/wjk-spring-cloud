package com.example.servicecustomer.service;

import com.example.servicecustomer.feign.UserFeign;
import com.example.servicecustomer.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private UserFeign userFeign;

    public BaseResponse findAllUsers(){
        return userFeign.findAllUsers();
    }
}
