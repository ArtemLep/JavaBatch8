package com.syntax.class28;

public class Student implements PrintInfo {
    @Override
    public void printName() {
        System.out.println("Artem");
    }

    @Override
    public void printNumber() {
        System.out.println("122334534");
    }

    @Override
    public void printAdress() {
        System.out.println("Brooklyn,USA");
    }
}
