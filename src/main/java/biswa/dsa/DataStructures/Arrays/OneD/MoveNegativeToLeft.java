package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

import biswa.dsa.Utill.IterationHelper;

/*
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so 
 * that all negative numbers appear before all positive numbers.
 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
public class MoveNegativeToLeft {

	public static void main(String[] args) {
		int[] arr1 = { -12, -11, -13, -5, -6, -7, -5, -3, -6 };
		approach1(arr1);
		int[] arr2 = { -12, -11, -13, -5, -6, -7, -5, -3, -6 };
		approach2(arr2);
		int[] arr3 = { -12, -11, -13, -5, -6, -7, -5, -3, -6 };
		approach3(arr3);
		int[] arr4 = { -12, -11, -13, -5, -6, -7, -5, -3, -6 };
		approach4(arr4);
		int[] arr5 = { -12, -11, -13, -5, -6, -7, -5, -3, -6 };
		approach5(arr5);
	}

	// TC: O(n log n)
	static void approach1(int[] arr) {
		Arrays.sort(arr);
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(n^2)
	static void approach2(int[] arr) {
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

	// TC: O(n)
	static void approach3(int[] arr) {
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] < 0 && i != j) {
				int store = arr[j];
				arr[j++] = arr[i];
				arr[i] = store;
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(n)
	static void approach4(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (arr[left] > 0 && arr[right] > 0) {
				left++;
				right--;
			} else if (arr[left] < 0 && arr[right] < 0) {
				left++;
			} else if (arr[left] < 0 && arr[right] > 0) {
				right--;
			} else if (arr[left] > 0 && arr[right] < 0) {
				int store = arr[right];
				arr[right] = arr[left];
				arr[left] = store;
				left++;
				right--;
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	static void approach5(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left < right) {
			if (arr[left] > 0) {
				int store = arr[right];
				arr[right--] = arr[left];
				arr[left++] = store;
			} else {
				left++;
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}
}
