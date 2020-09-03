package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:    WebJarsController
 * Package:    com.offcn.controller
 * Description:
 * Datetime:    2020/9/2   18:47
 * Author:  shoushaopan
 */
@Controller
public class WebJarsController {

      @RequestMapping("/gg")
    public String index() {
//        System.out.println("2222222");
        return "login.html";
    }

}