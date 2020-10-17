package com.syntax.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program to ask user to enter numbers of worked years and annual
		 * salary. If user worked for more or equals to 5 years than user is eligible
		 * for the bonus, otherwise he is not. Once user is eligible and salary is
		 * larger than 50000 than bonus = 5000, otherwise bonus=3000.
		 */
		Scanner scan;
		int years, salary;
		scan = new Scanner(System.in);
		System.out.println("Enter please your working years and the salary ");
		years = scan.nextInt();
		salary = scan.nextInt();
		if (years >= 5) {
			System.out.println("You are eligible for the bonus !!!");
			if (salary > 50000) {
				System.out.println("Your bonus = 5000");
			} else {
				System.out.println("Your bonus = 3000");
			}

		} else {
			System.out.println("You are not eligible for the bonus!!! ");
		}
	}

}
