package edu.hust.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Author: QX
 * @Date: 2020/3/27 16:03
 * @Version 1.0
 */
public class User implements Serializable {
    Integer userid;
    String username;
    Date brithday;
    String sex;
    String address;

    List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", brithday=" + brithday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
