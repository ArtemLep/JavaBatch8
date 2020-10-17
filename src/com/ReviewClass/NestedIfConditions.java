package com.ReviewClass;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Asghar";
		String pass = "pass123";
		double accountBalance = 10.25;
		double transferAmount = 8;
		boolean transAllowed = true;

		if (pass.equals("pass123")) {
			System.out.println("Welcome to Syntax bank ");
			if (transAllowed) {
				System.out.println("Initialing transfer");
				if (accountBalance < transferAmount) {
					System.out.println("Insufficient balance ");
				} else {
					System.out.println("Transfer complete");
				}
			} else {
				System.out.println("you are not allowed to trunsfer funds ");
			}
		} else {
			System.out.println("Invalid credentials please try again ");
		}

	}

}
