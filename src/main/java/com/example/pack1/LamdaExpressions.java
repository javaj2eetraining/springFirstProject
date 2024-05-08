package com.example.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressions {
    public static void main(String[] args) {
        Calculator add = (a,b)->a+b;

        double r =  add.calculate(10,20);
        System.out.println("Result "+r);


        List<Integer> a = new ArrayList<Integer>();

        a.add(1); // a.add(new Integer("1"))
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(8);


       int sum =  a.stream().filter(n-> n % 2 == 0).mapToInt(n->n).sum();

       System.out.println(sum);

    }
}

interface Calculator{
    double calculate(int a, int b);
}

