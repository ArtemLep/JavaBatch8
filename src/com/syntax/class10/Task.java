package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// TASK 1
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grades[1]);

		char[] grades1 = new char[6];
		grades1[0] = 'A';
		grades1[1] = 'B';
		grades1[2] = 'C';
		grades1[3] = 'D';
		grades1[4] = 'E';
		grades1[5] = 'F';
		System.out.println(grades1[1]);

		// Task 2
		String[] names = { "Artem", "Anna", "Timothy", "Denis", "Anatoly" };
		System.out.println(names[0]);

		String[] names1 = new String[5];
		names1[0] = "Artem";
		names1[1] = "Anna";
		names1[2] = "Timothy";
		names1[3] = "Denis";
		names1[4] = "Anatoly";

		System.out.println(names1[0]);

//TASK  3
		String[] words = { "Java", "Saturday", "day", "coding","is" };
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
	}

}
