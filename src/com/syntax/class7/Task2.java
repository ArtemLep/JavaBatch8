package com.syntax.class7;

public class Task2 {

	public static void main(String[] args) {

		boolean workDay = true;
		int day = 1;
		while (workDay) {
			System.out.println("I need a day off");
			day++;
			if (day == 6 || day == 7) {
				System.out.println("I dont need day off any more");
				break;
			}
		}
	}

}
