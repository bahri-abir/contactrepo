package com.example.listeproject;

public class User {
    private String name,msg,id;
    private int image;

    public User(String name, String msg, int image) {
        this.name = name;
        this.msg = msg;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public User(String name, String msg, String id) {
        this.name = name;
        this.msg = msg;
        this.id = id;
    }

    public User() {
    }

    public User(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
