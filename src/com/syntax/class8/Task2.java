package com.syntax.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int sumO = 0;
		int sumE = 0;

		for (int n = 1; n < 51; n++) {
			if (n % 2 == 0) {
				sumE += n;
			}
			if (n % 2 == 1) {
				sumO += n;
			}
		}
		System.out.println("The sum of even number from 1 to 50 is " + sumE);
		System.out.println("The sum of even number from 1 to 50 is " + sumO);

		
		
		System.out.println("________________________________");
		// Create a mult table;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter which number ");
		int num1=scan.nextInt();
		int mult;
		for (int i = 1; i <= 10; i++) {
			mult = num1 * i;
			System.out.println(num1 + "x" + i + "=" + mult);

		}
	}
}