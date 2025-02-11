package biswa.dsa.DataStructures.Arrays.OneD;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an array of integers arr, the task is to sort the array as per the given order
 * and return it, without using any built-in functions.
 * Input: arr = [5, 2, 4, 3, 1], order = "A"
 * Output: [1, 2, 3, 4, 5]
 * 
 * Input: arr = [5, 2, 4, 3, 1], order = "D"
 * Output: [5, 4, 3, 2, 1]
 */
public class SortAnArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 3, 1 };
		String order = "D";
		usingCoreJava(arr, order);
	}

	// TC: O(n2)
	static void usingCoreJava(int[] arr, String order) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (order == "A") {
					if (arr[j] < arr[i]) {
						int store = arr[i];
						arr[i] = arr[j];
						arr[j] = store;
					}
				} else {
					if (arr[j] > arr[i]) {
						int store = arr[i];
						arr[i] = arr[j];
						arr[j] = store;
					}
				}
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}
}
