package com.syntax.class11;

public class GroupTask3 {
    public static void main(String[] args) {
        /*Write a Java Program to print the first 10 numbers of Fibonacci series.
         */
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}


