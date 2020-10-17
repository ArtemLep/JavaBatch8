package com.syntax.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Saturday";
		if (day.equals("Saturaday") && day.equals("Sunday")) {
			System.out.println("Today i have a Java class at Synta[");
		}

		System.out.println("No output ");

		System.out.println("----------------------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter todays day using number only  ");
		int num = scan.nextInt();
		if (num == 1 || num == 5) {
			System.out.println("I am off from Syntax");
		} else if (num == 2 || num == 3) {
			System.out.println("Today is GIT class");

		} else if (num == 4) {
			System.out.println("Today is Review class");
		} else if (num == 6 || num == 7) {
			System.out.println("Today is Java class");
		}else {
			System.out.println("enter a valid day from 1-7 ");
		}
	}

}
