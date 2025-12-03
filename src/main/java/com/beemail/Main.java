package com.beemail;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        App app = App.getInstance();

        User user = new User("Ed", 2);

        user.addUser(app);
    }
}

