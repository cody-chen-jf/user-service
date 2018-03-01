package com.example.user.controller;

import com.example.user.common.RestResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getUserName")
    public RestResponse<String> getUserName(Long id){
        return RestResponse.success("test-user");
    }

    @RequestMapping("/getUserServicePort")
    public RestResponse<String> getUserServicePort(){
        return RestResponse.success(port);
    }

}
