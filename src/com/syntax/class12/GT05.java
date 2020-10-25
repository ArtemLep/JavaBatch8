package com.syntax.class12;

import java.util.Arrays;

public class GT05 {
    public static void main(String[] args) {
        /*Write a java program to find the second largest number in the array?
         */
        int[] num1 = {1, 5, 10, 3, 6};
        int length = num1.length;
        Arrays.sort(num1);
        System.out.println("Second highest number is " + num1[length - 2]);

        /*Write a java program to find the second largest number in the array without sort function?
        2nd WAY */
        int[] array = {1067, 90, 450, -34, 450, 1, 199};
        int max = array[0];
        int secondMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {

                secondMax = array[i];
            }
        }
        System.out.println(secondMax);
    }
}
