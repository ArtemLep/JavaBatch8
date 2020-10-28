package com.syntax.class9;

public class Arrays {

	public static void main(String[] args) {

		int[] num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		// to access element from an array?
		System.out.println("Accessing 3rd element " + num[3]);
		System.out.println(num[1] + num[4]);// 70
		// I would like to change 50 to 100
		num[4] = 100;
		System.out.println("Value of 5th element after change " + num[4]);

		String[] array = new String[4];
		array[0] = "Hello";
		array[1] = "Bye";
		array[2] = "Morning";
		array[3] = "Evening";
		System.out.println(array[0]);
	}

	public static void sort(int[][] data) {
		// TODO Auto-generated method stub
		
	}

}
