package com.offcn.pojo;



import javax.persistence.*;

/**
 * ClassName:    User
 * Package:    com.offcn.pojo
 * Description:
 * Datetime:    2020/9/3   18:53
 * Author:  shoushaopan
 */
@Entity
@Table(name = "tab_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
