package com.syntax.class7;

public class WhileLoopExamples {

	public static void main(String[] args) {

		String day = "Saturday";
		if (day.equals(day)) {
			System.out.println("My favorite Java Class");
		}
		while (day.equals(day)) {
			System.out.println("My favorite Java Class");
			day = "Sunday";
		}

		boolean isItBreakTime = true;
		if (isItBreakTime) {
			System.out.println("Get the tea");
		}
		while (isItBreakTime) {
			System.out.println("Get the tea");
			isItBreakTime = false;

		}

	}

}
