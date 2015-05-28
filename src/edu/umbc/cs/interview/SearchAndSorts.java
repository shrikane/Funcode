package edu.umbc.cs.interview;

public class SearchAndSorts {

	public SearchAndSorts() {
		// TODO Auto-generated constructor stub
	}

	 int binarySearch(int a[], int key, int low, int high) {
		if (low > high) {
			return -1;
		} else {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				return mid;
			} else {
				if (a[mid] < key) {
					return binarySearch(a, key, mid + 1, high);
				} else {
					return binarySearch(a, key, low, mid - 1);
				}
			}
		}

	}

	 int partitin(int a[], int low, int high) {
		int pivot = a[high];
		int i = low;
		for (int j = low; j <= high - 1; j++) {
			if (a[j] < pivot) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}

		int temp = a[high];
		a[high] = a[i];
		a[i] = temp;
		return i;
	}

	 void Qsort(final int[] a, int low, int high) {
		if (low < high) {
			int q = partitin(a, low, high);
			Qsort(a, low, q - 1);
			Qsort(a, q + 1, high);
		}
	}

	public static void main(String[] args) {
		SearchAndSorts s = new SearchAndSorts();
		int a[] = { 9, 6, 7, 8, 5 };
		s.Qsort(a, 0, a.length - 1);
		System.out.println(s.binarySearch(a, 9, 0, a.length - 1));
		;

	}
}
