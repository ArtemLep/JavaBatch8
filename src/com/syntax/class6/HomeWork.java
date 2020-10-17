package com.syntax.class6;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 */
		double num1, num2;
		double sum;
		char operator;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		System.out.println("Enter the operators");
		operator = scan.next().charAt(0);
		switch (operator) {
		case '+':
			sum = num1 + num2;
			break;
		case '-':
			sum = num1 - num2;
			break;
		case '/':
			sum = num1 / num2;
			break;
		case '*':
			sum = num1 * num2;
			break;
		case '%':
			sum = num1 % num2;
			break;
		default:
			sum = 0;
		}
		System.out.println("Based on operator provide the result is " + sum);
	}

}
