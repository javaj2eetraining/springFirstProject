package com.example.pack1;

public class NewThread implements Runnable  {

    public void run()
    {
        System.out.println(" in New Thread");
        for(int i = 0; i<1500;i++) {
            try {
                Thread.sleep(10);
                System.out.println("in New Thread " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
