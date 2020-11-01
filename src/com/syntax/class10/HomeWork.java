package com.syntax.class10;

public class HomeWork {

	public static void main(String[] args) {
//Task1
		String[] animals = { "Deer", "Dog", "Cat", "Cow", "Goat", "Horse" };
		for (String a : animals) {
			System.out.print(a + ",");
		}

		String[] animals1 = new String[6];
		animals1[0] = "Deer";
		animals1[1] = "Dog";
		animals1[2] = "Cat";
		animals1[3] = "Cow";
		animals1[4] = "Goat";
		animals1[5] = "Horse";
		for (String s : animals1) System.out.print(s + ";");
	}

}
