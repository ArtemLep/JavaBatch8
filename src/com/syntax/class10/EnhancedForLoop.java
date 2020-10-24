package com.syntax.class10;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] cars = { "Honda", "Acura", "Toyota", "Mersedes", "BMW" };
		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + ";");
		}
		System.out.println();

		System.out.println("===========Enhaced For Loop=============");

		for (String car : cars) {
			System.out.print(car + ",");
		}
		System.out.println();

		System.out.println("===========Enhaced For Loop=============");

		int[] numbers = { 10, 100, 90, 600, 89 };
		for (int num : numbers) {
			System.out.print(num + ",");
		}
		System.out.println();

		System.out.println("===========Enhaced For Loop=============");

		boolean[] arrayOfBoolean = { true, true, false, false, true };
		for (boolean bool : arrayOfBoolean) {
			System.out.print(bool + ",");
		}
	}
}
