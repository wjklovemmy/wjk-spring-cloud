package com.example.servicecustomer.controller;

import com.example.servicecustomer.service.CarService;
import com.example.servicecustomer.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("getCarInfo")
    public BaseResponse getCarInfo(){
        return carService.findAllUsers();
    }
}
