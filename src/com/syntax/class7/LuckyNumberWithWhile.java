package com.syntax.class7;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		Scanner scan;

		int numFromUser;
		int luckyNumber = 7;
		scan = new Scanner(System.in);
		System.out.println("Enter number from 1 to 100");
		numFromUser = scan.nextInt();
		while (numFromUser != luckyNumber) {
			System.out.println("Enter number from 1 to 100");
			numFromUser = scan.nextInt();

		}
		System.out.println("The lucky number is " + numFromUser);

	}

}
