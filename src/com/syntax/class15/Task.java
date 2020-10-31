package com.syntax.class15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mom,dad,baby;
        System.out.println("Mom's first name?");
        mom = scan.nextLine();
        System.out.println("Dad's first name?");
        dad = scan.nextLine();
        System.out.println("Boy or Girl?");
        baby = scan.next();
        if (baby.equalsIgnoreCase("boy")) {
            System.out.print(dad.substring(0, 2));
            System.out.println(mom.substring(mom.length() / 2));
        } else {
            System.out.print(mom.substring(0, 2));
            System.out.println(dad.substring(dad.length() / 2));
        }
    }
}
