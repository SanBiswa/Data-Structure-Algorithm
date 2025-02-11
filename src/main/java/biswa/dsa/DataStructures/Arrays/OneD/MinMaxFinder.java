package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

/*
 * Given an array of size N. The task is to find the maximum and the minimum element of the array
 * using the minimum number of comparisons.
 * 
 * Input: arr[] = {3, 5, 4, 1, 9}
 * Output: Minimum element is: 1
 * Maximum element is: 9
 */

public class MinMaxFinder {

	public static void main(String[] args) {
		int arr[] = { 22, 14, 8, 17, 35, 3 };
		usingCoreJava(arr);
		usingSorting(arr);
	}

	// TC: O(n)
	public static void usingCoreJava(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int i : arr) {
			if (i < min)
				min = i;
			if (i > max)
				max = i;
		}
		System.out.println("Minimum element is: " + min);
		System.out.println("Maximum element is: " + max);
	}

	// TC: O(n)
	public static void usingSorting(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Minimum element is: " + arr[0]);
		System.out.println("Maximum element is: " + arr[arr.length - 1]);
	}
}
