package com.syntax.class4;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner artem = new Scanner(System.in);
		System.out.println("Pleae enter boolean value for rain");

		boolean rain = artem.nextBoolean();
		if (rain) {
			System.out.println("Take an umbrella");
		} else {
			System.out.println("Nice weather");
		}
		System.out.println("--------------Lets capture Int value------------------------");
		System.out.println("Enter your age");
		int age = artem.nextInt();

		if (age < 18) {
			System.out.println("Wait till you get 18");
		}else if (age==18) {
			System.out.println("You can buy some alchogol");
		} else {
			System.out.println("You are adult");
			System.out.println("i am "+ age+" years old ");
		}
	}

}
