package com.syntax.class6;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three distinct numbers with decimal values ");
		double numberOne = scanner.nextDouble();
		double numberTwo = scanner.nextDouble();
		double numberThree = scanner.nextDouble();
		double largestNumber;
		if (numberOne > numberTwo && numberOne > numberThree) {
			largestNumber = numberOne;
		} else if (numberTwo > numberOne && numberTwo > numberThree) {
			largestNumber = numberTwo;
		} else {
			largestNumber = numberThree;
		}
		System.out.println("Largest number is " + largestNumber);

	}

}
