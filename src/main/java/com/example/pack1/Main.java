package com.example.pack1;

public class Main {
    public static void main(String a[]){
        String s1 = "Saritha";
        String s2 = "Saritha";
        String s3 = "Hello";
        String s4 = "Hello";

        System.out.println(s1 == s2 );
        System.out.println(s1 == s3 );

        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

        int x = 8;
        int y = 8;

        System.out.println(s1.hashCode());
        s1 = s1.concat("abcc");
        System.out.println(s1.hashCode());

        StringBuffer sb = new StringBuffer("Saritha");
        System.out.println(sb.hashCode());
        sb.append("abcc");
        System.out.println(sb.hashCode());

        StringBuilder sbuidler = new StringBuilder("Saritha");
        System.out.println(sbuidler.hashCode());
        sbuidler.append("abcc");
        System.out.println(sbuidler.hashCode());
    }
}
