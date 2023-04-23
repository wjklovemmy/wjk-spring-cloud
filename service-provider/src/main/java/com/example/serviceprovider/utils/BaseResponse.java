package com.example.serviceprovider.utils;

import lombok.Data;

@Data
public class BaseResponse {
    private int code;
    private String msg;
    private Object data;
}
