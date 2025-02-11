package biswa.dsa.DataStructures.Arrays.OneD;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an array, the task is to cyclically rotate the array clockwise by n times.
 * Input: arr[] = {1, 2, 3, 4, 5}, n = 2
 * Output: arr[] = {4, 5, 1, 2, 3}
 */
public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = 2;
		
		usingCoreJava(arr, n);
	}

	// TC: O(n^2)
	public static void usingCoreJava(int[] arr, int n) {
		if (n == arr.length) {
			IterationHelper.iterateIntegerArray(arr, "S");
			return;
		}
		if (n > arr.length)
			n = n % arr.length;

		for (int i = 0; i < n; i++) {
			int store = arr[arr.length - 1];

			for (int j = arr.length - 2; j >= 0; j--)
				arr[j + 1] = arr[j];

			arr[0] = store;
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}
}
