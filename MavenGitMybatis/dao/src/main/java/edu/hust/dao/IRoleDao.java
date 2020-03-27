package edu.hust.dao;

import edu.hust.domain.Role;

import java.util.List;

/**
 * @Author: QX
 * @Date: 2020/3/28 0:01
 * @Version 1.0
 */
public interface IRoleDao {
    public List<Role> findAll();
}
