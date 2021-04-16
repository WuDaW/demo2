package com.wu.demo2.modals;

public class User {
    private int uid;
    private String username;
    private String password;
    private String udanwei;
    private String rname;

    public User() {
        super();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUdanwei() {
        return udanwei;
    }

    public void setUdanwei(String udanwei) {
        this.udanwei = udanwei;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
}
