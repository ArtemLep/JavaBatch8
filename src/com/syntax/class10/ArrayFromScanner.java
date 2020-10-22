package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {

		// Lets ask user how many names he would like to store and then store those
		// names
		String[] names;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("how many names he would like to store?");
		size = scan.nextInt();

		names = new String[size];
//Storing values
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter any name");
			names[i] = scan.next();
		}
//we are retrieving values 
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "; ");
		}
	}
}
