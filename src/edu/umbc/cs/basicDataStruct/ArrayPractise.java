package edu.umbc.cs.basicDataStruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractise {

	public ArrayPractise() {
		// TODO Auto-generated constructor stub
	}

	/***
	 * checks of string contains duplicate characters 
	 * @param input test string 
	 * @return true if contains duplicate characters false else
	 */
	public boolean checkDuplicateWithExtraSpace(String input) {
		input = input.toLowerCase();
		Set<Character> charSet = new HashSet<Character>();
		for (char c : input.toCharArray()) {
			if (charSet.contains(c)) {
				return false;
			} else {
				charSet.add(c);
			}
		}
		return true;
	}

	/***
	 * Calculates length of c style \0 terminated string
	 * @param input input string
	 * @return length of input string
	 */
	public int getLength(char[] input) {
		int length = 0;
		// get length
		while (input[length] != '\0') {
			length++;
		}
		return length;
	}

	/**
	 * Reverses null terminated c style string
	 * @param input input string to be reveresed 
	 * @return reversed string
	 */
	char[] reverse(char[] input) {
		int length = getLength(input);
		for (int i = 0, j = length - 1; i < length / 2 && j > length / 2; i++, j--) {
			char c = input[i];
			input[i] = input[j];
			input[j] = c;
		}
		input[length] = '\0';
		return input;

	}

	/**
	 * Validates if test string is permutation of input string( case sensative)
	 * 
	 * @param input
	 *            string to be checked with (source string
	 * @param testString
	 *            string to be tested
	 * @return true if testString is permutation of input String
	 */
	public boolean isPermutation(String input, String testString) {
		Set<Character> charSet = new HashSet<Character>();
		for (Character c : input.toCharArray()) {
			charSet.add(c);
		}

		for (Character c : testString.toCharArray()) {
			if (!charSet.contains(c)) {
				return false;
			}
		}

		return true;
	}
}
