package com.syntax.class19;

public class ClassTask1 {
    /*Write a program that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    String name;
    int age;
    double height;
    double weight;

    ClassTask1() {
    }

    ClassTask1(String name, int age, double height, double weight) {
        if (name.equals("")) {
            System.out.println(" please enter your name");
        }
        if (age < 0 || age > 100) {
            System.out.println("please enter a valid age");
        }
    }

    public static void main(String[] args) {
        ClassTask1 s1 = new ClassTask1();
        s1.name = "Jon";
        s1.age = 200;
        ClassTask1 s2 = new ClassTask1("Can", 200, 200, 200);
    }
}