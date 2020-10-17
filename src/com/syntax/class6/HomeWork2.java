package com.syntax.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		String country, language;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Enter your country ");
		country = scan.nextLine();
		switch (country) {
		case "Ukraine":
			language = "Ukrainian";
			break;
		case "USA":
			language = "English";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language = "No exicting language";
		}
		System.out.println("Your language is " + language);
	}

}
