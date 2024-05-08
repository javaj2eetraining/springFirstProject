package com.example.pack1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



public class Student
{
    public static void main(String a[]){
        System.out.println(Thread.currentThread().getName());
        System.out.println(" in Main Thread");
        for(int i = 0; i<5;i++)
            System.out.println("in Main Thread "+i);



    }
}
