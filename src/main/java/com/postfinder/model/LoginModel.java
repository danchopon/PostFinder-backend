package com.postfinder.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class LoginModel {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String username;
    private String password;
    private Number battalionId;

    public LoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginModel() {
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Number getBattalionId() {
        return battalionId;
    }

    public void setBattalionId(Number battalionId) {
        this.battalionId = battalionId;
    }
}
