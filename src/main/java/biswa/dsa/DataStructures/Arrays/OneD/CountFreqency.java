package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

/*
 * Given a sorted array arr[] and an integer target, the task is to find the number of occurrences 
 * of target in given array.
 * 
 * Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
 * Output: 4
 * Explanation: 2 occurs 4 times in the given array.
 * 
 * Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
 * Output: 0
 * Explanation: 4 is not present in the given array.
 */
public class CountFreqency {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 2, 3 };
		int target = 2;
		approach1(arr, target);
		approach2(arr, target);
	}

	// TC: O(n)
	static void approach1(int[] arr, int target) {
		int count = 0;
		for (int i : arr)
			if (i == target)
				count++;
		System.out.println(count);
	}

	// TC: O(n)
	static void approach2(int[] arr, int target) {
		long count = Arrays.stream(arr).boxed().filter(f -> f == target).count();
		System.out.println(count);
	}
}
