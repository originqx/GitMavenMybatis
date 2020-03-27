package edu.hust.domain;

import java.io.Serializable;

/**
 * @Author: QX
 * @Date: 2020/3/27 16:09
 * @Version 1.0
 */
public class Role implements Serializable {
    Integer id;
    String role_name;
    String role_desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_desc() {
        return role_desc;
    }

    public void setRole_desc(String role_desc) {
        this.role_desc = role_desc;
    }
}
