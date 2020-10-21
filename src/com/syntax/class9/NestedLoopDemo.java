package com.syntax.class9;

public class NestedLoopDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {// outer loop
			System.out.println("Hello");
			for (int y = 0; y < 3; y++) {// inner loop
				System.out.println("Bye");
			}
		}
		System.out.println("==============More Exsmples===================");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("====================");
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				String hour = "";
				String minutes = "";
				if (i < 10) {
					hour = "0" + i;
				} else {
					hour = "" + i;
				}

				if (j < 10)
					minutes = "0" + j;

				else {
					minutes = "" + j;
				}
				System.out.println("" + hour + ":" + minutes);
			}
		}
	}
}
