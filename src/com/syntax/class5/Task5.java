package com.syntax.class5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =”Summer”. At the end of the program we should see output as “You were born
		 * ______”.
		 */
		Scanner input;
		String month;
		input = new Scanner(System.in);
		System.out.println("Please enter birth month ");
		month = input.nextLine();
		
		if (month.equals("December") || month.equals("January") || month.equals("Fabruary")) {
			month = "Winter";
			
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			month = "Spring";
			
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			month = "Summer";
			
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			month = "Autumn";
		}
	}
}
