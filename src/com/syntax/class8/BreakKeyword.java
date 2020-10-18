package com.syntax.class8;

public class BreakKeyword
{

	public static void main(String[] args) {
		// break
		for (int i = 1; i < 4; i++) {
			System.out.println("Hello");
			break;
		}
		System.out.println("__________________________________");
		// we want to ptint numbers from 1 to 10
		// when number is 5 we want to break the loop

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i);
		}
	}

}
