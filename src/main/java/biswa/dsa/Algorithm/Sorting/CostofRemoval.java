package biswa.dsa.Algorithm.Sorting;

import java.util.Arrays;

/*
 * Given N elements at every step remove an array elements.
 * Cost to remove element = sum of elements present in array.
 * find minimum cost to remove all elements from array.
 * Note: Add cost first then remove.
 */
public class CostofRemoval {

	public static void main(String[] args) {
		int[] arr = { 6, 7, 2, 4 };
		approach1(arr);
		approach2(arr);
	}

	// TC: O(n log n)
	// SC: O(n)
	public static void approach1(int[] arr) {
		Arrays.sort(arr);
		int cost = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				cost += arr[j];
			}
		}
		System.out.println(cost);
	}

	// TC: O(n log n)
	// SC: O(n)
	public static void approach2(int[] arr) {
		Arrays.sort(arr);
		int cost = 0;
		for (int i = 0; i < arr.length; i++) {
			cost += arr[i] * (arr.length - i);
		}
		System.out.println(cost);
	}
}
