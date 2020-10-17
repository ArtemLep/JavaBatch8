package com.syntax.class5;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner;
		scanner = new Scanner(System.in);
		// I want to capture sentence:
		String sentence = scanner.nextLine();
		System.out.println("You entered sentence: " + sentence);

		// I want to capture number

		int number = scanner.nextInt();
		System.out.println("You entered number: " + number);

		// I want to capture 1 word

		String word = scanner.next();
		System.out.println("You entered word: " + word);

		// I want to capture 1 character

		char singleChar = scanner.next().charAt(0);
		System.out.println("You entered character: " + singleChar);

	}

}
