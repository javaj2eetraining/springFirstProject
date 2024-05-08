package com.example.pack1;

public class ThreadCommunicationExample {

    public static void main(String args[]) throws InterruptedException {

        Account acct = new Account();

        Thread t1 = new Thread() {
            public void run() {
                acct.withdrawMoney(10000);
            }
        };

        t1.start();

        Thread.sleep(10000);

        Thread t2 = new Thread() {
            public void run() {
                acct.depositMoney(2000);
            }
        };

        t2.start();

        Thread.sleep(10000);

        Thread t3 = new Thread() {
            public void run() {
                acct.depositMoney(5000);
            }
        };

        t3.start();
    }
}