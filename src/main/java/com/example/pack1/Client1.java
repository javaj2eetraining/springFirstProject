package com.example.pack1;

public class Client1 {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.showMessage();
    }
}
