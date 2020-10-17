package com.syntax.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 15;
		System.out.println(a > b);// false
		System.out.println(a < b);// true
		System.out.println(a == b);// false
		System.out.println(a != b);// true

		int x = 100;
		int y = 90;
		boolean result = x > y;
		System.out.println(result); // true

		result = x == y;
		System.out.println(result);// false

		System.out.println(x = y);

		boolean result1 = x == y;
		System.out.println(result1);

	
		byte num=10;
		byte num1=10;
		boolean boo=num>=num1;
		System.out.println(boo);
	}

}
