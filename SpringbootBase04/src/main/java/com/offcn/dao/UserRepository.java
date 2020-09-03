package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName:    UserRepository
 * Package:    com.offcn.dao
 * Description:
 * Datetime:    2020/9/3   18:58
 * Author:  shoushaopan
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
