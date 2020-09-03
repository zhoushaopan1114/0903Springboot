package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:    FirstThymeleafController
 * Package:    com.offcn.controller
 * Description:
 * Datetime:    2020/9/3   16:40
 * Author:  shoushaopan
 */
@Controller
public class FirstThymeleafController {

    @RequestMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "login";
    }

}
