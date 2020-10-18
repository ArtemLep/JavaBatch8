package com.syntax.class8;

import java.util.Scanner;

public class Task4 {

	/*
	 * Write a program to ask a user to enter item they want to buy and the price of
	 * that item. Every time user enters money accumulate the amount and tell the
	 * user how much is left to pay off. If user give more money program should
	 * return a change. Whenever a user done with payments program should say “Thank
	 * you for shopping!”
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter what item you're buying and price.");
		String item = scan.nextLine();
		double price = scan.nextDouble();
		System.out.println("Please enter how much you will pay.");
		double payment = scan.nextDouble();
		double balance = price - payment;
		for (double a = payment; a <= price; a--) {
			if (payment != price) {
				System.out.println("You owe " + balance);
				break;
			} else if (payment == price) {
				System.out.println("Enjoy your " + item);
				break;
			} else if (payment > price) {
				System.out.println("please enter valid range");
			}
		}
	}
}
