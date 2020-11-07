package com.syntax.class17;

import javax.sound.midi.Soundbank;

import static com.syntax.class17.Students.numberOfStudents;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        String email = task1.createEmail("Artem", "Lepinskyi", "Gmail");
        System.out.println(email);
        System.out.println("===================");
        Task2 task2 = new Task2();
        Boolean prime = task2.isPrime(25);
        Boolean prime1 = task2.isPrime(1);
        Boolean prime2 = task2.isPrime(10);
        Boolean prime3 = task2.isPrime(24);
        System.out.println("isPrime(25)" + prime);
        System.out.println("isPrime(1)" + prime1);
        System.out.println("isPrime(10)" + prime2);
        System.out.println("isPrime(24)" + prime3);
        System.out.println("===================");

        Task3 task3 = new Task3();
        System.out.println(task3.getGrade(90));
        System.out.println(task3.getGrade(101));

        Variables Artem = new Variables();
        Artem.name = "Artem";
        Artem.age = 32;
        Artem.marks = 90;
        Artem.printInfo();

        Variables Danillo = new Variables();
        Danillo.name = "Danillo";
        Danillo.age = 30;
        Danillo.marks = 95;
        Danillo.printInfo();

        Variables Anna = new Variables();
        Anna.name = "Anna";
        Anna.age = 31;
        Anna.marks = 98;
        Anna.printInfo();
        System.out.println("===================");

        Employee employee = new Employee();
        employee.empID = 1;
        employee.salary = 4000;
        Employee.CEO = "Sumair";

        Employee employee1 = new Employee();
        employee1.empID = 2;
        employee1.salary = 2000;
        System.out.println(employee1.CEO);

        System.out.println("===================");
        Students Art = new Students();
        Art.studentID = 123;
        Art.studentName = "Artem";
        Students.numberOfStudents++;
        System.out.println(Art.studentID);
        System.out.println(Art.studentName);
        System.out.println(Students.numberOfStudents);


        Students Ann = new Students();
        Ann.studentID = 2345;
        Ann.studentName = "Anna";
        Students.numberOfStudents++;

        System.out.println(Ann.studentID);
        System.out.println(Ann.studentName);
        System.out.println(Students.numberOfStudents);

    }
}
