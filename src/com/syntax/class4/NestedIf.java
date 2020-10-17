package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean allergy = true;
		boolean petAllergy = true;

		if (allergy) {
			System.out.println("Do check");
			if (petAllergy) {
				System.out.println("No pets");
			} else {
				System.out.println("You dont have pet allergy");
			}

		} else {
			System.out.println("You are lucky");

		}
		System.out.println("----------------EXAMPLE-2--------------");

		boolean Friday = false;
		int date = 4;

		if (Friday) {
			System.out.println("We will watch movie");
			if (date == 13) {
				System.out.println("watch scary movie");
			} else {
				System.out.println("Will watch comedy");
			}
		} else {
			System.out.println("I am Studying");
		}
		System.out.println("----------------EXAMPLE-3--------------");

		int score = 92;
		boolean assigments = true;
		if (assigments) {
			System.out.println("will check your score");
			if (score > 90) {
				System.out.println("Great job");
			} else if (score > 80) {
				System.out.println("Good job");
			} else if (score > 70) {
				System.out.println("Please study more");
			} else {
				System.out.println("Thanks for trying, stuy more");
			}
		} else {
			System.out.println("Should complete all assigments");
		}
	}

}
