package com.syntax.class19;


public class StudentClassTask2 {

    String name;
    double subject1;
    double subject2;
    double subject3;
    /*
    Write a java program of Class Students that takes students name and 3
    subject grades. Inside your class also have a method to Calculate
    Average Grade. Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables
     */

    StudentClassTask2(String nameValue, double subject1Value, double subject2Value, double subject3Value) {
        name = nameValue;
        subject1 = subject1Value;
        subject2 = subject2Value;
        subject3 = subject3Value;
    }

    void printGradeAverage() {
        double avg = (subject1 + subject2 + subject3) / 3;
        
        System.out.println("Average marks for " + name + " are " + avg);
    }

    void printsubject1Marks() {

    }

    public static void main(String[] args) {
        StudentClassTask2 student1 = new StudentClassTask2("Marta", 93, 90, 91);
        student1.printGradeAverage();
        StudentClassTask2 student2 = new StudentClassTask2("Jack", 87, 80, 97);
        student2.printGradeAverage();
        StudentClassTask2 student3 = new StudentClassTask2("Danilo", 100, 100, 100);
        student3.printGradeAverage();
        StudentClassTask2 student4 = new StudentClassTask2("Maria", 98, 94, 96);
        student4.printGradeAverage();
        StudentClassTask2 student5 = new StudentClassTask2("Nabin", 100, 100, 92);
        student5.printGradeAverage();
    }
}






