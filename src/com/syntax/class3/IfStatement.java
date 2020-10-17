package com.syntax.class3;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 1800;
		int num2 = 900;
		System.out.println("First prorgam");
		if (num1 > num2) {
			System.out.println("num1 is bigger than num2");
		}

		System.out.println("End of statement");
		System.out.println("------------------------------------------------");

		int temp = 60;
		if (temp >= 60) {
			System.out.println("Going to the beach");
		} else {
			System.out.println("Will do hunting");
		}
		System.out.println("------------------------------------------------");

		double expectedHours = 15;

		double actualHours = 20;
		if (actualHours > expectedHours) {
			System.out.println("You will love the course");
		} else {
			System.out.println("You are imbicil");
		}
	}

}
