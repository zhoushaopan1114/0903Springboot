package com.offcn.controller;

import com.offcn.pojo.Car;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName:    CarController
 * Package:    com.offcn.controller
 * Description:
 * Datetime:    2020/9/2   17:45
 * Author:  shoushaopan
 */
@RestController
public class CarController {

    @RequestMapping("/getcar1")
    public Car getCar() {
        Car car = new Car();
        car.setId(1);
        car.setName("兰博基尼");
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull(null);
        return car;
    }

    @RequestMapping("/getcarlist1")
    public List<Car> getCarAll() {
        Car car = new Car();
        car.setId(1);
        car.setName("兰博基尼");
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull("不为空显示");

        List<Car> list = new ArrayList<Car>();
        list.add(car);
        list.add(car);
        list.add(car);
        list.add(car);
        return list;
    }
    //@RequestParam :请求参数
    //@PathVariable :请求路径
    @RequestMapping("/getcar2/{name}")
    public Car getCarById(@RequestParam(name = "id") Integer id, @PathVariable(name = "name") String name) {
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull("不为空显示");
        return car;
    }

    @RequestMapping("/getcar3")
    public Car getCarById2(@RequestBody Car car) {
        return car;
    }

    //{name:[a-zA-Z]{3}}：这样的表达式指定了 name 必须是大小写字母组成的3位长度。
    @RequestMapping("/getcar5/{name:[a-zA-Z]{3}}")
    public Car getCarById3(@PathVariable(name = "name") String name) {
        Car car = new Car();
        car.setId(999);
        car.setName(name);
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull("不为空显示");
        return car;
    }

}
