package com.syntax.class8;

import java.util.Scanner;

public class Tas {
	public static void main(String[] args) {
		Scanner inp;
		int x;
		inp = new Scanner(System.in);
		System.out.print("In:");

		// write your code below
		x = inp.nextInt();
		for (int i = x-1; i >= x/113; i--) {
			System.out.print(i + " ");
		}
		

	}
}
