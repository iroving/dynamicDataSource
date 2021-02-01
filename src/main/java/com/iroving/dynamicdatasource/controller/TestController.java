package com.iroving.dynamicdatasource.controller;

import com.iroving.dynamicdatasource.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @Autowired
    private TestService testService;

    /**
     * 获取错误信息
     *
     * @return
     */
    @GetMapping("/test")
    public String getErrorLog() {
        testService.test();
        return "responseEntity";
    }

    /**
     * 获取错误信息
     *
     * @return
     */
    @GetMapping("/test2")
    public String getErrorLog2() {
        testService.test2();
        return "responseEntity";
    }
}
