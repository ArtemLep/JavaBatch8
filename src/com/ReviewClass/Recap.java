package com.ReviewClass;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner scan;
		boolean weekend;
		String subject;
		scan = new Scanner(System.in);

		System.out.println("Is it weekend?");

		weekend = scan.nextBoolean();

		if (!weekend) {
			subject = "Manual testing";
		} else {
			subject = "Java";
		}
		System.out.println("Today you will be learning " + subject);
	}
}
