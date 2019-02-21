package com.example.demoMbaits.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String account;
    private String pwd;
    private Integer status;

    private String setRediskey;

    public String getSetRediskey() {
        return setRediskey;
    }

    public void setSetRediskey(String setRediskey) {
        this.setRediskey = setRediskey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", status=" + status +
                '}';
    }
}
