package edu.hust.dao;

import edu.hust.domain.User;

import java.util.List;

/**
 * @Author: QX
 * @Date: 2020/3/27 16:17
 * @Version 1.0
 */
public interface IUserDao {


    List<User> findAll();

    //
//    User findById();
//
//    List<User> findByName();
    List<User> findAllRole();

    User findById(Integer id);
}
