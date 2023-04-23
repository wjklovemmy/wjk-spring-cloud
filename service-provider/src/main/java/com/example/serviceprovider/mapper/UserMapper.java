package com.example.serviceprovider.mapper;

import com.example.serviceprovider.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAllUsers();
}
