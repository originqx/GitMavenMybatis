package edu.hust.domain;

/**
 * @Author: QX
 * @Date: 2020/3/27 17:02
 * @Version 1.0
 */
public class AccountUser extends Account {
    String username;
    String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
