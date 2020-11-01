package com.syntax.class10;

import java.util.Scanner;

public class HomeWork3 {
//Task 2
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[6];
		int sum = 0;
		System.out.println("Enter the elements:");
		for (int i = 0; i < 6; i++) {
			arr[i] = scan.nextInt();
		}
		for (int num : arr) {
			sum = sum + num;
		}
		System.out.println("Sum of array elements is:" + sum);
	}
}