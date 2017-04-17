package com.eclipse.EduardoZavala;

import java.util.Scanner;

/**
 * This program has a recursive method that accepts a string as its argument and
 * prints the string in reverse order.
 * 
 */

public class StringReverserDemo {

	public static void main(String[] args) {

		// Instance of Scanner Class
		Scanner keyboard = new Scanner(System.in);

		// Print instructions for user
		System.out.print("Enter a string of characters and I'll reverse the order");

		// Get user input
		String input = keyboard.nextLine();

		// Call toReverse method passing string input along with the length -1
		String reversedString = toReverse(input, input.length() - 1);

		System.out.print("length is:" + input.length());
		// Display output
		System.out.print("Your string is: " + reversedString);

		// Close scanner
		keyboard.close();

	}

	// Recursive method to reverse the order of the input string.
	static String toReverse(String string, int index) {
		if (index == 0) {
			return string.charAt(0) + ""; // Base case
		}
		char letter = string.charAt(index);
		return letter + toReverse(string, index - 1);
	}
}