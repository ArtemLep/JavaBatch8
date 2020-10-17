package com.syntax.class5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5  output “It is a weekday”, anyday from 6-7  output “It is a
		 * weekend”, any other day output “Invalid day”
		 */
		Scanner input;
		int day;
		input = new Scanner(System.in);
		System.out.println("Please enter a day ");
		day = input.nextInt();
		if (day == 1 || day == 5) {
			System.out.println("Weekday");
		} else if (day == 6 | day == 7) {
			System.out.println("Weekend");
		} else {
			System.out.println("Ivalid day");
		}
	}

}
