package com.syntax.class8;

public class ClassKeyword {

	public static void main(String[] args) {

		// I want to print numbers from 1to 5 except number 3

		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i==7) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("End of the loop");
		
		
	}

}
