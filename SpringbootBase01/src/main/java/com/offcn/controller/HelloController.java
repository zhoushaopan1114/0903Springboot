package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:    HelloController
 * Package:    com.offcn.controller
 * Description:
 * Datetime:    2020/9/2   17:28
 * Author:  shoushaopan
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello, Spring boot - zsp";
    }
}
