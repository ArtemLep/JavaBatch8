package com.syntax.class28;

public class Employee implements PrintInfo{
    @Override
    public void printName() {
        System.out.println("Anna");
    }

    @Override
    public void printNumber() {
        System.out.println("123442");
    }

    @Override
    public void printAdress() {
        System.out.println("Moscow,Russia");
    }
}
