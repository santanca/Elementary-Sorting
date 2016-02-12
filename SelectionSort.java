package cas.xb3.lab4.wt;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		Comparable<Integer>[] arr = new Integer[] { 5, 2, 3, 1, 4 };
		System.out.print("Before Sort:");
		System.out.println(Arrays.toString(arr));
		BubbleSort(arr);
		System.out.print("After Sort:");
		System.out.println(Arrays.toString(arr));

	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void sort(Comparable[] a) { // Sort a[] into increasing order.
		int N = a.length; // array length
		for (int i = 0; i < N; i++) { // Exchange a[i] with smallest entry in
										// a[i+1...N).
			int min = i; // index of minimal entr.
			for (int j = i + 1; j < N; j++)
				if (less(a[j], a[min]))
					min = j;
			exch(a, i, min);
		}
	}

	public static void BubbleSort(Comparable[] num) {
		int j;
		boolean sorted = true;// set flag to true to begin first pass
		while (sorted) {
			sorted = false;// set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if (less(num[j + 1], num[j])) {
					exch(num, j, j + 1);
					sorted = true;// shows a swap occurred
				}
			}
		}
	}

	public static boolean isSorted(Comparable[] a) { // Test whether the array
														// entries are in order.
		for (int i = 1; i < a.length; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
}
