package com.syntax.class11;

public class LargestNumber<largest> {

    public static void main(String[] args) {


        // I would like to find largest number from your array?

        int[] numArray = {10, 0, 20, 8, -1, 77, 56};
        int max = numArray[0];

        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > max) {


                max = numArray[i];

            }

        }
        System.out.println("The largest number from an array is " + max);
    }


}







