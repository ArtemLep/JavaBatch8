package com.syntax.class12;

public class GT03 {
    public static void main(String[] args) {
        /*Write a Java Program to print the first 10 numbers of Fibonacci series.
         */

        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i <= 10; i++) {

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3 + " ");
        }
    }
}