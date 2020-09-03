package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:    UserController
 * Package:    com.offcn.controller
 * Description:
 * Datetime:    2020/9/2   19:41
 * Author:  shoushaopan
 */
@RestController
@RequestMapping("/users-test")
public class UserController {
    private List<User> listUser = new ArrayList<>();
    //增加
    @PostMapping("/")
    public List<User> add(@RequestBody User user){
        listUser.add(user);
        return listUser;
    }
    //查询全部
    @GetMapping("/")
    public List<User> getAll(){
        return listUser;
    }
    //查询单个
    @GetMapping("/{id}")
    public User add(@PathVariable Long id){
        for (User user : listUser) {
            if (id.longValue() == user.getId().longValue()){
                return user;
            }
        }
        return null;
    }

    //修改
    @PutMapping("/")
    public void update(@RequestBody User user){
        for (User user1 : listUser) {
            if (user1.getId() == user.getId()){
                user1.setName(user.getName());
                user1.setAge(user.getAge());
            }
        }
    }

    //删除
    @DeleteMapping("/{id}")
    public List<User> del(@PathVariable Long id){
        List<User> newList = new ArrayList<>();
        for (User user1 : listUser) {
            if (user1.getId().longValue() != id.longValue()){
                newList.add(user1);
            }
        }
        listUser = newList;
        return listUser;
    }
}
