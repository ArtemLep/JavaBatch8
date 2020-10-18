package com.syntax.class8;

public class Task {

	public static void main(String[] args) {

		for (int x = 20; x >= 1; x--) {
			if (x % 2 == 0)
				System.out.print(x);
		}
		System.out.println();
		System.out.println("=================================");

		for (int z = 20; z >= 2; z--) {
			System.out.print(z);
			z--;
		}
		System.out.println();
		System.out.println("====================================");

		for (int y = 20; y <= 50; y++) {
			if (y % 2 == 1) {
				System.out.print(y);
			}

		}
		System.out.println();
		System.out.println("==============================");
		for (int m = 21; m <= 50; m++) {
			System.out.print(m);
			m++;
		}
		System.out.println();
		System.out.println("==============================");
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
			}
		System.out.print(sum + " ");
		System.out.println("__________________________");
		int a;
		for(a=1;a<6;a++) {
			System.out.println("You are inside loop " +a);
		}
		System.out.println("Value outside loop "+a);
		
		
		int result=1;
		for(int i=10;i>=1;i-=2) {
			result*=i;
			System.out.println("Result = " +result);//10,80,480,1920,3840;

		}
	}
}
