package com.syntax.class8;

import java.util.Scanner;

public class Tas {
	public static void main(String[] args) {
		Scanner inp;
		int x = 0;
		System.out.print("In:");
		inp = new Scanner(System.in);
		x = inp.nextInt();
		for (int i = 0; i <= x; i++) {
			if (x >=i) {
				continue;
			
			}
			System.out.println(i);
		}

	}

}
