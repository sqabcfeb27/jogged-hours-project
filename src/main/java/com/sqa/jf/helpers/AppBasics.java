/**
 * File Name: AppBasics.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 4, 2017
 */
package com.sqa.jf.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static boolean requestBoolean(String question) {
		String input;
		boolean booleanValue = false;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			booleanValue = Boolean.parseBoolean(input.trim());
		} catch (NumberFormatException e) {
			System.out
					.println("You have not entered a correct boolean value (" + input + ")\nUsing false for set value");
		}
		return booleanValue;
	}

	public static char requestChar(String question) {
		String input;
		char character = 'A';
		System.out.print(question + " ");
		input = scanner.nextLine();
		if (input.trim().length() > 1) {
			System.out.println("You have not entered more than one character (" + input + ")\nUsing 'A' for set value");
		} else {
			character = input.trim().charAt(0);
		}
		return character;
	}

	/**
	 * @param question
	 * @return
	 */
	public static double requestDouble(String question) {
		String input;
		double count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Double.parseDouble(input.trim());
		} catch (NumberFormatException e) {
			System.out.println("You have not entered a correct numerical value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static float requestFloat(String question) {
		String input;
		float count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Float.parseFloat(input.trim());
		} catch (NumberFormatException e) {
			System.out.println(
					"You have not entered a correct float numerical value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static int requestInt(String question) {
		String input;
		int count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Integer.parseInt(input.trim());
		} catch (NumberFormatException e) {
			System.out.println(
					"You have not entered a correct int numerical value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static long requestLong(String question) {
		String input;
		long count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Long.parseLong(input.trim());
		} catch (NumberFormatException e) {
			System.out.println(
					"You have not entered a correct Long numerical value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static short requestShort(String question) {
		String input;
		short count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Short.parseShort(input.trim());
		} catch (NumberFormatException e) {
			System.out.println(
					"You have not entered a correct Short numerical value (" + input + ")\nUsing 0 for set value");
		}
		return count;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
