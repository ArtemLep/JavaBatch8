package com.syntax.class8;

import java.util.Scanner;

public class Tack {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String answer;
		System.out.println("Do you want to apply for a credit card?");
		answer = scan.next();

		while (answer.equalsIgnoreCase("no")) {
			System.out.println("Do you want to apply for a credit card?");
			answer = scan.next();
			{
				if (answer.equalsIgnoreCase("yes"))
					break;
			}
		}
		System.out.println("This is your card");
	}
}