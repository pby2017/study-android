package com.example.day19.example01;

public class MySingleton {

    private static final MySingleton INSTANCE = new MySingleton();
    private String data;

    private MySingleton() {
    }

    public static MySingleton getINSTANCE() {
        return INSTANCE;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
