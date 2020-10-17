package com.syntax.class7;

public class Task {

	public static void main(String[] args) {
		int a = 99;
		while (a >= 1) {
			System.out.print(a + " ");
			a -= 2;
		}
		System.out.println( "====================================");
		int a1 = 100;
		while (a1 >= 0) {
			if (a1 % 2 == 1) {
				System.out.print(a1 + " ");

			}
			a1 --;
		}
	}

}
