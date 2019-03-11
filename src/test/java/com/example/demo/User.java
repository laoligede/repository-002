package com.example.demo;

import java.io.Serializable;

/**
 * @author tong.li
 * @date 2019/2/15 15:33
 */
public class User implements Serializable {
    private String userName;
    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
