package com.jeasonzuo.controller;

import com.jeasonzuo.utils.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public ResponseResult homePage() {
        return ResponseResult.success("Home page");
    }
}
