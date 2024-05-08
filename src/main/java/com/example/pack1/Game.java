package com.example.pack1;

public class Game {
    boolean isPlayer = false;
    void player() throws InterruptedException {
        while(!isPlayer)
        {
            wait();
        }
        System.out.println(" Player 1");
    }
    void player2() throws InterruptedException {
        isPlayer = true;
        notify();
        System.out.println(" Player 2");
    }
}
