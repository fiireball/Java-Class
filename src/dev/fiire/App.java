package dev.fiire;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Ceasar cipher
		int shift;
		String message;
		String encodedMessage;
		char[] chars;
		char[] shiftedChars;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter secret shift: ");

		shift = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter message to encode: ");
		message = sc.nextLine();

		chars = message.toCharArray();
		shiftedChars = new char[chars.length];

		for (int i = 0; i < chars.length; i++) {
			if (isLetter(chars[i])) {
				shiftedChars[i] = getShifted(chars[i], shift);
			} else {
				shiftedChars[i] = chars[i];
			}
		}

		encodedMessage = new String(shiftedChars);
		System.out.println(encodedMessage);
		
	}

	private static char getShifted(char ch, int shift) {
		char shiftedChar = ch;
		if (shift > 26) {
			shift = shift % 26;
		}
		if (isInBoundsShift(ch, shift)) {
			shiftedChar = (char) (ch + shift);
		} else {
			shiftedChar = getWrappedShift(ch, shift);
		}
		return shiftedChar;
	}

	private static char getWrappedShift(char ch, int shift) {
		char shiftedChar = ch;
		if (isLetter(ch)) {
			shiftedChar = (char) (ch + shift - 26);
		}
		return shiftedChar;
	}

	private static boolean isLetter(char ch) {
		if (isLowercaseLetter(ch)) {
			return true;
		}

		if (isUppercaseLetter(ch)) {
			return true;
		}

		return false;
	}

	private static boolean isLowercaseLetter(char ch) {
		if (ch >= 65 && ch <= 90) {
			return true;
		}
		return false;
	}

	private static boolean isUppercaseLetter(char ch) {
		if (ch >= 97 && ch <= 122) {
			return true;
		}
		return false;
	}

	private static boolean isInBoundsShift(int charCode, int shift) {
		if (isLowercaseLetter((char) charCode)) {
			if (charCode + shift <= 90) {
				return true;
			}
		}

		if (isUppercaseLetter((char) charCode)) {
			if (charCode + shift <= 122) {
				return true;
			}
		}

		return false;
	}

}
