package com.beemail;

public class App {
    private static App instance;

    private App(){
    }

    public static App getInstance(){
        if (instance == null){
            instance = new App();}

        return instance;
    }
}
