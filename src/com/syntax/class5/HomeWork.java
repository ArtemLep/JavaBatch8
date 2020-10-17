package com.syntax.class5;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You are working in sales and have to calculate commission for the employees;
		 * You need to ask user a sales amount and based on the amount you need to
		 * define their commission if user sold products for more than $10 but less than
		 * 100 --> commission is 10% if sales is more than 100 but less then 200 -->
		 * commission is 20% if sales is more than 200 but less then 500 --> commission
		 * is 30% if sales is more than 500 --> commission is 50% You program should
		 * print How much in commission user will get
		 */
		Scanner input;
		int amount;
		double commision;
		input = new Scanner(System.in);
		System.out.println("Please enter sales amount ");
		amount = input.nextInt();

		if (amount > 10 && amount < 200) {
			commision = (amount + 10) / 100;
		} else if (amount > 100 && amount < 200) {
			commision = (amount + 20) / 100;
		} else if (amount > 200 && amount < 500) {
			commision = (amount + 30) / 100;
		} else if (amount > 500) {
			commision = (amount + 50) / 100;

		} else {
			commision = 0;
		}
		System.out.println("The user will get in commision " + commision);
	}

}
