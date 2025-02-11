package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an unsorted array of integers, sort the array into a wave array. An array arr[0..n-1] is sorted
 * in wave form if: arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
 * 
 * Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 * Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
 * 
 * Input: arr[] = {20, 10, 8, 6, 4, 2}
 * Output: arr[] = {20, 8, 10, 4, 6, 2}
 */
public class ArrayWave {

	public static void main(String[] args) {
		int[] arr = {20, 10, 8, 6, 4, 2};
		approach1(arr);
		approach2(arr);
	}

	public static void approach1(int[] arr) {
		Arrays.sort(arr);
		int length = arr.length - 1;
		int[] res = new int[arr.length];
		int high = 0, low = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				res[i] = arr[length - high++];
			else
				res[i] = arr[low++];
		}
		IterationHelper.iterateIntegerArray(res, "S");
	}
	
	public static void approach2(int[] arr) {
		
	}
}
