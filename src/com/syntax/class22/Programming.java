package com.syntax.class22;

public class Programming {/*
Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
then the message "I love programming languages" should be printed. If some String is passed to it,
then in place of "programming languages"
the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.*/
    static class Programming1{
        Programming1() {
            System.out.println("I love programming languages");
        }
        Programming1(String str){
            System.out.println("I love "+str);
        }
        public static void main(String[] args) {
            Programming1 a=new Programming1();
            Programming1 str=new Programming1("Java");
        }
    }
}
