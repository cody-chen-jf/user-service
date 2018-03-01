package com.example.user.controller;

import com.example.user.common.RestResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUserName")
    public RestResponse<String> getUserName(Long id){
        return RestResponse.success("test-user");
    }

}
