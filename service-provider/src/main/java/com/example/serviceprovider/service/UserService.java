package com.example.serviceprovider.service;

import com.example.serviceprovider.mapper.UserMapper;
import com.example.serviceprovider.pojo.User;
import com.example.serviceprovider.utils.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public BaseResponse findAllUsers(){
        BaseResponse baseResponse = new BaseResponse();
        List<User> users = userMapper.findAllUsers();
        baseResponse.setData(users);
        return baseResponse;
    }
}
