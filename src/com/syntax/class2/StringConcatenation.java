package com.syntax.class2;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Olga";
		// I would like to say : My name is Olga
		System.out.println("My name is " + name);
		String lastName = "Sorrels";
		System.out.println("My first and Last name is " + name + " " + lastName);

		String city = "Miami";
		System.out.println(name + " lives in " + city);

		char grade = 'B';
		System.out.println(name + " is " + grade + " Student");

		int age = 21;
		System.out.println(name + " is " + age + " years old");

		int date = 27;
		String month = "September";
		System.out.println(date + " " + month);

		String state = "DC";
		String anotherState = "           DC ";

		// above String are not equal, state 2 char, anotherState 3 char!
		System.out.println(state);
		System.err.println(anotherState);
	}

}
