package com.syntax.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		Scanner scan;
		String name;
		scan = new Scanner(System.in);

//		int num = 1;
//		while (num <= 5) {
//
//			System.out.println("Please tell me your name");
//			name = scan.nextLine();
//			System.out.println("Nice to meet you " + name);
//			System.out.println("====================");
//			num++;
//		}
//
//		System.out.println("==================================");
		int numFromUser;
		int luckyNumber = 7;
		do {
			System.out.println("Enter number from 1 to 100");
			numFromUser = scan.nextInt();
		} while (numFromUser != luckyNumber);
		System.out.println("The lucky number is " + numFromUser);
	}

}
