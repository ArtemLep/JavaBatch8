package com.syntax.class16;

public class Task3 {
    /*Create a method that will print whether given String is palindrome or not.
     */
    public static void main(String[] args) {
        print("madam");
    }
    public static void print(String myString){
        String reverseString = new StringBuffer(myString).reverse().toString();
        if (myString.equals(reverseString)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
