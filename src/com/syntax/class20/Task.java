package com.syntax.class20;

import com.syntax.class8.Tas;

public class Task {
    /*Write a program  that will have 4 different access levels
    of constructors and create 3 objects of this class:
     1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.*/
    String name;
    int age;
    double salary;

    private Task(String name) {
        this.name = name;
    }

    Task(int age) {
        this.age = age;
    }

    public Task(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
     //   Task task1 = new Task("Artem");

        Task task1=new Task("Artem");
        System.out.println(task1.age);
        System.out.println(task1.name);
        System.out.println(task1.salary);

        Task task2=new Task(12);
        System.out.println(task2.age);
        System.out.println(task2.name);
        System.out.println(task2.salary);

        Task task3=new Task(100.00);
        System.out.println(task3.age);
        System.out.println(task3.name);
        System.out.println(task3.salary);

    }

}
