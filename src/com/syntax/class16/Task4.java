package com.syntax.class16;

public class Task4 {
    /*Create a method that will say Hello in different language based on the country that
    will passed when method is executed.
     */
    public static void main(String[] args) {
        printHello("Russia");
    }
    public static void printHello(String myString){
        if(myString.equalsIgnoreCase("Russia")){
            System.out.println("Privet");
        }else if(myString.equalsIgnoreCase("Ukraine")){
            System.out.println("Pruvit");
        }else if(myString.equalsIgnoreCase("France")){
            System.out.println("Bonjour");
        }else if(myString.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else{
            System.out.println("Dont know this language!");
        }
    }
}
