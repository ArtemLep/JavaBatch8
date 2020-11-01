package com.syntax.class10;

import java.util.Scanner;

import com.syntax.class9.Arrays;

public class HomeWork2 {

	public static void main(String[] args) {
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int odd = 0;
		int sum = 0;
		// Loop to find even, odd sum
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					sum+=a[i][j];
					System.out.println(a[i][j] + " "+sum);

				}
			}

		}
		System.out.println();
	}
}