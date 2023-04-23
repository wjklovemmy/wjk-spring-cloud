package com.example.servicecustomer.feign;

import com.example.servicecustomer.utils.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-provider")
@Component
public interface UserFeign {
    @GetMapping("findAllUsers")
    public BaseResponse findAllUsers();
}
