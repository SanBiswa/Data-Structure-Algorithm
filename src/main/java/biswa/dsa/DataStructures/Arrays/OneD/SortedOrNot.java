package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

/*
 * Given an array of size n, the task is to check if it is sorted in ascending order or not.
 * Equal values are allowed in an array and two consecutive equal values are considered sorted.
 * 
 * Input: arr[] = [20, 21, 45, 89, 89, 90]
 * Output: Yes
 * 
 * Input: arr[] = [20, 20, 78, 98, 99, 97]
 * Output: No
 */
public class SortedOrNot {

	public static void main(String[] args) {
		int[] arr1 = { 20, 21, 45, 89, 89, 90 };
		approach1(arr1);
		int[] arr2 = { 20, 21, 45, 89, 89, 90 };
		approach2(arr2);
		int[] arr3 = { 20, 21, 45, 89, 89, 90 };
		approach3(arr3);
	}

	// TC: 1 + n + n + 1 + 1 => 2n + 3 => O(n)
	static void approach1(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			copy[i] = arr[i];
		Arrays.sort(arr);
		if (Arrays.equals(arr, copy))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	// TC: n * n => O(n2)
	static void approach2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	// TC: O(n)
	static void approach3(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
