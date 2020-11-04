package com.syntax.class17;

public class Task3 {
    /*Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F*/

    char getGrade(int marks) {
        char grade;
        if (marks > 90 && marks <= 100) {
            grade = 'A';
        } else if (marks > 80) {
            grade = 'B';
        } else if (marks > 70) {
            grade = 'C';
        } else if (marks > 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}

