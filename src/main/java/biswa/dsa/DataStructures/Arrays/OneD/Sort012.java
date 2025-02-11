package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an array arr[] consisting of only 0s, 1s, and 2s. The task is to sort the array, i.e., 
 * put all 0s first, then all 1s and all 2s in last.
 * 
 * Input: arr[] = {0, 1, 2, 0, 1, 2}
 * Output: {0, 0, 1, 1, 2, 2}
 * Explanation: {0, 0, 1, 1, 2, 2} has all 0s first, then all 1s and all 2s in last.
 */
public class Sort012 {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 2, 2, 0, 1, 1, 1, 2, 2, 2, 0 };
		approach1(arr);
		approach2(arr);
		approach3(arr);
	}

	// TC: n + n => 2n => O(n)
	static void approach1(int[] arr) {
		int zero = 0, one = 0;
		for (int i : arr) {
			if (i == 0)
				zero++;
			else if (i == 1)
				one++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (zero > 0) {
				arr[i] = 0;
				zero--;
			} else if (one > 0) {
				arr[i] = 1;
				one--;
			} else {
				arr[i] = 2;
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(n)
	static void approach2(int[] arr) {
		Arrays.sort(arr);
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(n^2)
	static void approach3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int store = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = store;
				}
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}
}
