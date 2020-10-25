package com.syntax.class11;

public class GroupTask1 {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;
        String a = "Good";
        String b = "Morning";

        x = x + y;      //x = 100 + 200 = 300
        y = x - y;      //y = 300 - 200 = 100
        x = x - y;      //x = 300 - 100 = 200

        a = a + b;

        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("x = " + x + " and y = " + y);
        System.out.println("===============");
        System.out.println("The value of a " + a);
        System.out.println("The value of b " + b);

    }
}

