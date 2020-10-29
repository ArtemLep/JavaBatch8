package com.syntax.class14;

public class Task {
    public static void main(String[] args) {
        String passwords = " Qwerty1234";
        String userName = "Anonymus";
        if (userName.isEmpty() && passwords.isEmpty()) {
            System.out.println("Username and Password should not be empty");
        } else if (passwords.length() < 8) {
            System.out.println("Password is too short");
        } else if (passwords.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if (!passwords.equals("Syntax@154")) {
            System.out.println("Password do not match");
        } else {
            System.out.println("You logged in");
        }

    }
}
