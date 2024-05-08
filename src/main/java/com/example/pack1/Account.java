package com.example.pack1;

public class Account {

    private int totalBalance = 5000;

    synchronized void withdrawMoney(int withdrawAmt) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " : withdrawing " + withdrawAmt);

        while (this.totalBalance < withdrawAmt) {
            System.out.println(threadName + " : low balance. Deposit some money.");
            try {
                System.out.println(threadName + " : please deposit some money. I am waiting.");
                wait();
            } catch (Exception e) {
            }
        }
        totalBalance -= withdrawAmt; //totalBalance = totalBalance-withdrawAmount
        System.out.println(
                Thread.currentThread().getName() + " : withdrawl completed. Remaining Balance = " + totalBalance);
    }


    synchronized void depositMoney(int depositAmt) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " : depositing " + depositAmt);
        totalBalance += depositAmt;//totalBalance = totalBalance + depositAmt;
        System.out.println(
                threadName + " : deposit of money done. Total balance = " + totalBalance);
        System.out.println(threadName + " : You can withdraw now.");
//        notifyAll();
    }

}
