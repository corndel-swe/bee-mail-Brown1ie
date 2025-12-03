package com.beemail;

import java.util.ArrayList;

public class User {
    private int stringId;
    private String username;
    private ArrayList<Message>messageArrayList = new ArrayList<>();
    private App app;

    public User(String username, int stringId) {
        this.username = username;
        this.stringId = stringId;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public void addUser(App app){
        app.addUser(this);
    }
}
