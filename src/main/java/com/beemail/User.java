package com.beemail;

import java.util.ArrayList;

public class User {
    private int stringId;
    private String username;
    public ArrayList<User> userArrayList;

    private User(int stringId, String username) {
    };

    public void addUser(int stringId, String username){
        userArrayList.add(new User(stringId,username));
    }

    public static User user(int stringId, String username){
        return new User(stringId,username);

    }

}
