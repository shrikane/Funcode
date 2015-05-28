package edu.umbc.cs.interview;


public class SearchNextMaximumNumber {

	// we can use primitive int with value Integer.MAX_VALUE or
	// Integer.MIN_VALUE
	// but null is better as even set returns null if not found
	public static final Integer NOT_FOUND = null;

	/**
	 * Returns index of first number greater than key 
	 * @param key input number 
	 * @param low minimum index for search
	 * @param high maximum index for search
	 * @param input list of elements  
	 * @return
	 */
	Integer search(int key, int low, int high, int input[]) {
		int mid = (int) (low + high) / 2;
		if (low == high) {
			if (low < input.length) {
				return low;
			} else {
				return NOT_FOUND;
			}
		}

		if (input[mid] > key) {
			return search(key, low, mid, input);
		} else {
			return search(key, mid + 1, high, input);
		}
	}

}