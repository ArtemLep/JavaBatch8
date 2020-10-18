package com.syntax.class8;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		int even = 0;
		int odd = 0;
		System.out.println("Enter start and end points of desired range");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		if (a < b) {
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0) {
					even += i;
				} else {
					odd += i;
				}
			}
		} else {
			for (int i = a; i >= b; i--) {
				if (i % 2 == 0) {
					even += i;
				} else {
					odd += i;
				}
			}
		}
		System.out.println("Sum of even numbers is " + even);
		System.out.println("Sum of odd numbers is " + odd);
	}
}