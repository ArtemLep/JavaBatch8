package com.syntax.class20;

public class TaskTester {
    public static void main(String[] args) {
      /*  Task task1=new Task("Artem");
        System.out.println(task1.age);    //because the constuctor is private
        System.out.println(task1.name);
        System.out.println(task1.salary);*/

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
