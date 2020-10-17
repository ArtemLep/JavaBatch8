package com.syntax.class7;

public class WhileLoopIntro {

	public static void main(String[] args) {

		int time = 15;
		if (time > 12) {
			System.out.println("Good day");// executes once

		}
		System.out.println("==============WHILE LOOP==============");

		/*
		 * while (time > 12) { System.out.println("good day"); // INFINITE LOOP time--;
		 * }
		 */
		while (time > 12) {
			System.out.println("good day"); // 3 times
			time--;
		}
		while (time > 12) {
			System.out.println("good day");// infinite loop
			time++;
		}
		System.out.println("============================================");
		// Print num from 1 to 50
		int num = 0;
		while (num <= 50) {
			System.out.println(num);
			num++;
		}
		// Print num from 10 to 60
		int a = 10;
		while (a < 61) {
			System.out.println(a);
			a++;
		}
		// Print num from 100 to 60
		int b = 100;
		while (b >= 60) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println(" Print num from 10 to 30 only even numbers");
		int c = 10;
		while (c <= 30) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println("Another way");
		int d = 10;
		while (d <= 30) {
			System.out.print(d + " ");
			d += 2;
		}

	}

}
