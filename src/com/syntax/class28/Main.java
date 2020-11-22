package com.syntax.class28;

public class Main {
    public static void main(String[] args) {
        PrintInfo printInfo=new Student();
        printInfo.printName();
        printInfo.printNumber();
        printInfo.printAdress();
        System.out.println("================================");
        PrintInfo printInfo1=new Employee();
        printInfo1.printName();
        printInfo1.printNumber();
        printInfo1.printAdress();
    }
}
