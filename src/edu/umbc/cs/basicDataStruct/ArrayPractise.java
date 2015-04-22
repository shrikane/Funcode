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
	 * 
	 * @param input
	 *            test string
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
	 * 
	 * @param input
	 *            input string
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
	 * 
	 * @param input
	 *            input string to be reveresed
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

	/**
	 * Replace all spaces by '%20'
	 * 
	 * @param input
	 *            input string
	 * @param length
	 *            true length of string
	 * @return
	 */
	char[] replaceAll(char[] input, int length) {

		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (input[i] == ' ') {
				spaceCount++;
			}
		}

		int newLength = length + 2 * spaceCount;
		for (int i = length - 1; i >= 0; i--) {
			if (input[i] == ' ') {
				input[--newLength] = '0';
				input[--newLength] = '2';
				input[--newLength] = '%';
			} else {
				input[--newLength] = input[i];
			}
		}
		return input;
	}

	/**
	 * Compress string for e.g aabbccd =a2b2b2d1 
	 * @param input input string
	 * @return if compressed string length is less than orignal string then compressed string else 
	 * 		   orignal string	
	 */
	String basicStringCompression(String input) {
		StringBuffer br = new StringBuffer();
		int counter = 1;
		int i = 0;
		while (i < input.length() - 1) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				counter++;
			} else {
				br.append("" + input.charAt(i) + "" + counter);
				counter = 1;
			}
			i++;
		}
		br.append("" + input.charAt(i) + "" + counter);
		String outString = br.toString();
		if (outString.length() <= input.length()) {
			return outString;
		} else {
			return input;
		}

	}
	
	
	boolean isRoatation(String input,String test){
		char [] testChars = test.toCharArray();
		int i=0;
		for (;i<testChars.length;i++) {
			if(input.charAt(0) ==  testChars[i]){
				break;
			}
		}
		
		char [] roatetedChars = new char[testChars.length];
		for(int j=0;j<testChars.length;j++){
			roatetedChars[j] = testChars[i];
			i = (i+1)%testChars.length;
		}
		
		return new String(roatetedChars).equals(input.substring(0,testChars.length));
	}

}
