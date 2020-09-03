package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * ClassName:    UserController
 * Package:    com.offcn.controller
 * Description:
 * Datetime:    2020/9/3   19:02
 * Author:  shoushaopan
 */
@Controller
@RequestMapping("/manageruser")
public class UserController {

    @Autowired
    private UserService userService;

    /***
     * 获取全部用户信息
     *
     * @return
     */
    @GetMapping("/")
    public String getUserList(Model model) {
        List<User> list = userService.getUserList();
        model.addAttribute("page", list);
        return "user/list";
    }

    /***
     * 跳转到新增用户界面
     *
     * @param user
     * @return
     */
    @RequestMapping("/toAdd")
    public String toadd(User user) {
        return "user/userAdd";
    }

    /***
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping("/add")
    public String createUser(User user) {
        userService.createUser(user);
        return "redirect:/manageruser/";
    }

    @RequestMapping("/toEdit/{id}")
    public String toEdit(Model model, @PathVariable("id") Long id) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.updateUser(user);
        return "redirect:/manageruser/";
    }

    /***
     * 删除指定id用户
     *
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/manageruser/";

    }
}