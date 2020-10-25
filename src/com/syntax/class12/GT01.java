package com.syntax.class12;

public class GT01 {
    public static void main(String[] args) {
        /*Write a program to swap 2 numbers without a temporary variable?
         */
        int x = 5;
        int y = 8;
        x = y + x;
        y = x - y;
        x = x - y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
