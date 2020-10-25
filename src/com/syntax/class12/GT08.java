package com.syntax.class12;

public class GT08 {
    public static void main(String[] args) {
        /*Create a 2D array to store numbers and calculate sum of all odd numbers.
         */
        int[][] a = {{0, 1, -2, 3}, {4, -5}};
        System.out.println(a.length);
        System.out.println("==================");//2
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 != 0) {
                    sum += a[i][j];
                }
            }
        }
        System.out.print("The total of odd numbers in this array is " + sum);

    }
}