package com.syntax.class8;

import java.util.Scanner;

public class RecapWithDoWhile {

	public static void main(String[] args) {
		/*
		 * ask user pay for the water water price is 5$ once user enters the money then
		 * we need more money or less once user gives us exact 5 then ---> enjoy your
		 * water
		 */
		Scanner scan;
		int money;
		int waterPrice = 5;
		scan = new Scanner(System.in);
		System.out.println("Please pay for your water");
		money = scan.nextInt();
		do {
			if (money > waterPrice) {
				System.out.println("This is too much, entered less money");
			} else if (money<waterPrice){
				System.out.println("Water  is expensive,please insert more money");
			}
			money = scan.nextInt();
		} while (money != waterPrice);
		System.out.println("Enjoy yuor water!!!");

	}

}
