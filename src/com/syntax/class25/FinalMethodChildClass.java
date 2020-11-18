package com.syntax.class25;

public class FinalMethodChildClass extends FinalMethodClass {

    double add(double num1, double num2) {

        System.out.println("New code added in the child class");

        return super.add(num1, num2);
    }

}
