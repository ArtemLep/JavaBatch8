package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.oddNum(5);
        task2.oddNum(10);
        task2.oddNum(56);

    }

    void oddNum(int num1) {// if we gonna use only void method we have create an object
        if (num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
