package com.example.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterring {
    public static void main(String[] args) {

        //filtering

        ArrayList<String> a  = new ArrayList<String>();

        a.add("Saritha");
        a.add("ABC");
        a.add("ACF");
        a.add("GHI");

        List filternames = a.stream().filter(n  ->  n.startsWith("A")).collect(Collectors.toList());
        System.out.println(" Filtered name  "+filternames);



        //mapping

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(2);  // 2
        a1.add(3);  //9
        a1.add(4);  //16
        a1.add(5); //25

      List<Integer> l =   a1.stream().map(n -> n*n ).collect(Collectors.toList());

        System.out.println(" the squares are "+l);

// sorting

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Watermelon");


       List<String>  lFrutits =  fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(lFrutits);


        //Reduce


        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(2);  // 2
        a3.add(3);  //9
        a3.add(4);  //16
        a3.add(5); //25
        int m = 0;
        for(int i=0; i<a3.size(); i++){
              sum = sum+a3.get(i);

     }
        System.out.println(sum);
       int sum1 =  a3.stream().reduce(0,Integer :: sum);

     int mulitply =   a3.stream().reduce(1, (f,g) -> f*g);
        System.out.println(mulitply);


    }
}
