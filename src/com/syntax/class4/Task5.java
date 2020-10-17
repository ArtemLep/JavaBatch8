package com.syntax.class4;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Task2
		double MortRate = 4.0;
		double MortPrice = 100.000;

		if (MortRate > 4.5) {
			System.out.println("I am not buy a House!");

		} else {
			System.out.println("I will consider!!!");
			if (MortPrice > 200.000) {
				System.out.println("I will take a loan!");
			} else {
				System.out.println("I will pay by cash!");
			}
		}
	}

}
