package com.syntax.class15;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /*How would you reverse a String character by character?
         */
        String input = "Hello World";
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println("Reversed string is:" + reverse);
        System.out.println("=========2 way============");

        String input1 = "Hello World";
        StringBuilder input2 = new StringBuilder();
        input2.append(input);
        input2 = input2.reverse();
        System.out.println(input2);
        System.out.println("===========================");

        /*How would you reverse a String word by word?
         */
        String str = "Welcome to java Artem";
        String words[] = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            reversedString = " " + words[i] + reversedString;
        }
        System.out.print("Reversed string word by word: ");
        System.out.println(reversedString);
        System.out.println("===========================");

        /*How would you swap  2 strings without a temporary variable?

         */

        String a = "Happy";
        String b = "Halloween";
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
        System.out.println("===========================");

        /* How would you check if String is palindrome or not?
         */

        String str1, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str1 = sc.nextLine();
        int length = str1.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str1.charAt(i);

        if (str1.equals(rev))
            System.out.println(str1 + " is a palindrome");
        else
            System.out.println(str1 + " is not a palindrome");


    }
}



