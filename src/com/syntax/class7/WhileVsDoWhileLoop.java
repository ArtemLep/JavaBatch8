package com.syntax.class7;

public class WhileVsDoWhileLoop {

	public static void main(String[] args) {
		System.out.println("===================WHILE====================");

		int a = 20;
		// check condition
		while (a < 15) {
			System.out.println("Hello");
			a++;

		}
		System.out.println("===================DO WHILE====================");
		int b = 20;
		// first DO something
		do {
			System.err.println("Hi");
			b++;
			// check the Condition
		} while (b < 15);
	}

}
