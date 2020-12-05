package com.ReviewClass7;

class Student {
    static int totalStudentCount;
    static final String schoolName = "Syntax";
    String name;
    final static int MAX_STUDENTS_ALLOWED = 3;
    private static Student student = null;

    private Student() {
        totalStudentCount++;
    }

    static Student getInstance() {
        if (student == null) {
            student = new Student();
        }
        return student;

    }

    void printInfo() {
        System.out.println("Name of the student "
                + name + " Name of the school "
                + schoolName + " Total Students registered " + totalStudentCount);
    }
}



