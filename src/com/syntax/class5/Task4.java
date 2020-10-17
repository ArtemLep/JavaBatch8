package com.syntax.class5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 grade=A if the average score >= 70 and <90 grade=B if the
		 * average score>=50 and <70 grade=C if the average score<50 grade=F
		 */
		Scanner input;
		int score2, score1, score3;

		input = new Scanner(System.in);
		System.out.println("Please enter input of score1 ");
		score1 = input.nextInt();
		System.out.println("Please enter input of score2 ");
		score2 = input.nextInt();
		System.out.println("Please enter input of score3");
		score3 = input.nextInt();
		double avrg = (score1 + score2 + score3) / 3;
		System.out.println(avrg);
		if (avrg >= 90) {
			System.out.println("A");
		} else if (avrg >= 70 && avrg < 90) {
			System.out.println("B");
		} else if (avrg >= 50 && avrg < 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}

}
