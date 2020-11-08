package com.syntax.class20;

public class Task2 {
    /*Write a Student class   that have instance variables name and address. Create a constructor
    that will initialize those variables.
    Print name & address of given  student using displayInfo method.*/
    String name,address;
    Task2(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Task2 task=new Task2("Artem","Brooklyn,NY");
        task.displayInfo();

    }
    }

