package com.syntax.class8;

public class ForLoopIntro {

	public static void main(String[] args) {
		for (int i = 10; i <= 0; i++) {
			System.out.println("Good morning!");
		}
		System.out.println("==============Print number from 10 to 0==================");

		for (int i = 10; i >= 0; i--) {
			System.out.print(i + "");
		}
		System.out.println("=============What will be the output=============");
		for (int i = 0; i <= 30; i += 3) {
			System.out.print(i + " ");
		}
	}
}
