package edu.hust.dao;

import edu.hust.domain.Account;

import java.util.List;

/**
 * @Author: QX
 * @Date: 2020/3/27 16:17
 * @Version 1.0
 */
public interface IAccountDao {

    List<Account> findAll();


    List<Account> findById( Integer id);


}
