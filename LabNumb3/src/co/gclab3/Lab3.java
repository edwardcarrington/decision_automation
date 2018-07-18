package co.gclab3;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String evenOdd;

		System.out.println(
				"Hello. I'd like for you to to provide me with a whole number between 1 and 100. I will then perform the following:");
		System.out.println(" ");

		System.out.println("If the number is odd, I will print the number entered and the word ODD.");
		System.out.println(" ");

		System.out.println("If the number is even and in the range of 2 to 25, I will print EVEN and less than 25.");
		System.out.println(" ");

		System.out.println("If the number is even and in the range of 26 to 60, I will print out EVEN.");
		System.out.println(" ");

		System.out.println(
				"Finally, if the number entered is odd and greater than 60, I will print out ODD and over 60.");
		System.out.println(" ");

		System.out.println("Now let's get started. Please enter a whole number between 1 and 100.");
		int userNum = input.nextInt();

		if (userNum % 2 == 0) {
			evenOdd = " was EVEN";
		} else
			evenOdd = " was ODD";
		{

		}
		if ((userNum >= 2) && (userNum <= 25)) {
			System.out.println("Your input of " + userNum + evenOdd + " and less than 25.");

		} else if ((userNum >= 26) && (userNum <= 60)) {
			System.out.println("Your input of " + userNum + evenOdd + " and more than 25.");

		} else if (userNum > 60) {
			System.out.println("Your input of " + userNum + evenOdd + ".");

		} else if ((userNum >= 1) && (userNum <= 60)) {
			System.out.println("Your input of " + userNum + evenOdd + ".");

		} else if (userNum > 60) {
			System.out.println("Your input of " + userNum + evenOdd + " and greater than 60.");

			input.close();
		}
	}
}