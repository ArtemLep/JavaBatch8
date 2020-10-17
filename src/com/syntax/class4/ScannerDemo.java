package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 80;
		String str = "I am a String";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any text");
		String value = scan.nextLine();// waits for ur input

		System.out.println("I captured value= " + value);
		System.out.println("Enter your name!");
		String name = scan.nextLine();
		System.out.println("Nice to meet you " + name);
	}

}
