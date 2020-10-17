package com.syntax.class5;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		String answer;
		double balance;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Is the user has a credit card? ");

		answer = scan.nextLine();
		if (answer.equals("Yes")) {
			System.out.println("What is a balance of your card? ");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your card balance ");
			} else {
				System.out.println("You can spend more $$$ ");
			}
		} else {
			System.out.println("Would you like to get a credit card? ");
		}

	}

}
