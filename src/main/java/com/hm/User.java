package com.hm;


import java.util.UUID;

public class User {

    private String _id;
    private String login;
    private String pass;
    public User () {
        this._id = UUID.randomUUID().toString();
    }
    public User (String login, String pass) {
        this._id = UUID.randomUUID().toString();
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
