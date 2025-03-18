package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.yaml.snakeyaml.util.ArrayUtils;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an array, the task is to cyclically rotate the array clockwise by n times.
 * Input: arr[] = {1, 2, 3, 4, 5}, n = 2
 * Output: arr[] = {4, 5, 1, 2, 3}
 */
public class ArrayRotation {

	public static void main(String[] args) {
		int n = 2;

		approach1(createArray(), n);
		approach2(createArray(), n);
		approach3(createArray(), n);
		approach4(createArray(), n);
	}

	// TC: O(n^2)
	// using 2 for loops
	public static void approach1(int[] arr, int n) {
		if (n > arr.length)
			n = n % arr.length;

		if (n == arr.length) {
			IterationHelper.iterateIntegerArray(arr, "S");
			return;
		}

		for (int i = 0; i < n; i++) {
			int store = arr[arr.length - 1];

			for (int j = arr.length - 2; j >= 0; j--)
				arr[j + 1] = arr[j];

			arr[0] = store;
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(n)
	// using a new array
	public static void approach2(int[] arr, int n) {
		int length = arr.length;
		if (n > length)
			n = n % length;

		if (n == arr.length) {
			IterationHelper.iterateIntegerArray(arr, "S");
			return;
		}

		int[] newArr = new int[length];
		for (int i = 0; i < length; i++) {
			newArr[i] = arr[length - n];
			if (--n == 0) {
				n = length;
			}
		}
		IterationHelper.iterateIntegerArray(newArr, "S");
	}
	
	// TC: O(n)
	// using stream API
	public static void approach3(int[] arr, int n) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.rotate(list, n);
		System.out.println(list);
	}

	// TC: O(3 n) => O(n)
	// using array reverse and recursion
	public static void approach4(int[] arr, int n) {
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, n, arr.length - 1);
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	public static void reverseArray(int[] arr, int start, int end) {
		if (start > end)
			return;
		int store = arr[start];
		arr[start++] = arr[end];
		arr[end--] = store;
		reverseArray(arr, start, end);
	}

	public static int[] createArray() {
		return new int[] { 1, 2, 3, 4, 5 };
	}
}
