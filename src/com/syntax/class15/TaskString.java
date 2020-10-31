package com.syntax.class15;

public class TaskString {
    //TASK
    public static void main(String[] args) {
        String a="We gonna do all our tasks!";
        System.out.println(a.replace(" ", ""));
        System.out.println("===================");


        //TASK2
        String B="a b c d e f g h";
        System.out.println(B.replace(" ", "").length());
        System.out.println("===================");

        //TASK3
        String c="Is it saturday? Is it raining? Do we have a Java Class today?";
        String newA= c.replaceAll("[a-z A-Z]", "");
        System.out.println(newA.length());
    }
}
