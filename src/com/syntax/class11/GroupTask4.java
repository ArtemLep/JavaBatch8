package com.syntax.class11;

public class GroupTask4 {
    public static void main(String[] args) {
        /*Maximum and minimum number in the array?
         */
        int largeArray[] = {13, 15, 4, 8, 10, 34, 45, 88};
        int smallest = largeArray[0];
        int largest = largeArray[0];

        for (int i = 0; i < 7; i++) {
            if (largeArray[i] < smallest) {
                smallest = largeArray[i];
            }
            if (largeArray[i] > smallest) {
                largest = largeArray[i];
            }
        }
        System.out.println("The smallest value of array " + smallest);
        System.out.println("The largest value of array " + largest);
    }
}

