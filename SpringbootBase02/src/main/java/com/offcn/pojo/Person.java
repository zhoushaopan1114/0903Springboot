package com.offcn.pojo;

import javax.persistence.*;

/**
 * ClassName:    Person
 * Package:    com.offcn.pojo
 * Description:
 * Datetime:    2020/9/2   20:21
 * Author:  shoushaopan
 */
@Entity
@Table(name = "tab_user")
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
