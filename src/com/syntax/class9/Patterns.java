package com.syntax.class9;

public class Patterns {

	public static void main(String[] args) {
		for (int r = 1; r <= 6; r++) {
			for (int c = 1; c <= 12; c++) {
				System.out.print("*");// pattern with "*"

			}
			System.out.println();
		}
		System.out.println("==========================================");
		for (int r = 1; r <= 7; r++) { // 11111 //444444 //77777
			for (int c = 1; c <= 6; c++) { // 22222 //555555
				System.out.print(r); // 33333 //666666

			}
			System.out.println();
		}
		System.out.println("==========================================");
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");

			}
			System.out.println();
//				1
//				12
//				123
//				1234
		}

	}
}
