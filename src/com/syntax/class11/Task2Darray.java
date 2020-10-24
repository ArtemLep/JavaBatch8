package com.syntax.class11;

public class Task2Darray {
    public static void main(String[] args) {
/*Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss
and  Smith, Jordan, Jackson, Obama.*/
        String[][] array = {
                {"Mr ", "Mrs ", "Ms ", "Miss "},
                {"Smith", "Jordan", "Jackson", "Obama"},
        };
        System.out.print(array[0][1] + array[1][0] + ", " + array[0][0] + array[1][3] + ", " + array[0][2] + array[1][2] + ", " + array[0][3] + array[1][1]);

        System.out.println("================");
        /*Create an array of cars : american, german, korean, italian. And print all values from a 2D array*/

        String cars[][] = {
                {"Chevy", "Jeep"},
                {"BMW", "Mercedes"},
                {"Kia", "Hyundai"},
                {"Alfa-Romeo", "Ferrari"}
        };
        for (String[] carArray : cars) {
            for (String car : carArray) {
                System.out.print(car + " ");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }



    }
}