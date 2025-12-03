package com.beemail;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static App instance;
    private List<User> users = new ArrayList<>();

    private App() {
    }

    public static App getInstance() {
        if (instance == null) {
            instance = new App();
        }

        return instance;
    }

    public void addUser(User user) {
        user.setApp(this);
        users.add(user);
    }
}
