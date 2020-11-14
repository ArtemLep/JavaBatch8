package com.syntax.class22;

public class Task3 {
    /*Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.*/

    private void print() {
        System.out.println("I am a private method,you can also overload me.With NO PARAMETERS");
    }

    private void print(int var) {
        System.out.println("I am a private method,you can also overload me, WITH 1 PARAMETERS");
    }

    private void print(String var) {
        System.out.println("I am a private method,you can also overload me,WITH STRING PARAMETERS");
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.print();
        task3.print(10);
        task3.print("Name");
    }
}
