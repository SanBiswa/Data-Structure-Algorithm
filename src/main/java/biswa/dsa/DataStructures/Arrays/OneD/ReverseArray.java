package biswa.dsa.DataStructures.Arrays.OneD;

import biswa.dsa.Utill.IterationHelper;

/*
 * Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements
 * such that the first element becomes the last, the second element becomes second last and so on.
 * 
 * Input: arr[] = {1, 4, 3, 2, 6, 5}  
 * Output: {5, 6, 2, 3, 4, 1}
 * Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
 */
public class ReverseArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 3, 9, 2, 6, 5 };
		usingTwoPointers(arr1);
		int arr2[] = { 1, 4, 3, 9, 2, 6, 5 };
		usingNewArray(arr2);
		int arr3[] = { 1, 4, 3, 9, 2, 6, 5 };
		usingRecurssion(arr3, 0, arr3.length-1);
	}

	/*
	 * TC: O(n) Why O(n), why not O(log n) because, although the loop runs n/2 times
	 * but the the internal operations(store, swap, increment, decrement) also takes
	 * constant amount of time that's why it is directly proportional to the O(n)
	 * instead of O(log n).
	 */	
	public static void usingTwoPointers(int[] arr) {
		int left = 0, right = arr.length - 1;
		IterationHelper.iterateIntegerArray(arr, "S");
		while (left < right) {
			int store = arr[left];
			arr[left] = arr[right];
			arr[right] = store;
			left++;
			right--;
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(n)
	public static void usingNewArray(int[] arr) {
		int[] newArr = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--)
			newArr[index++] = arr[i];
		IterationHelper.iterateIntegerArray(newArr, "S");
	}
	
	// TC: O(n)
	public static void usingRecurssion(int[] arr, int left, int right) {
		if(left > right) {
			IterationHelper.iterateIntegerArray(arr, "S");
			return;
		}
		int store = arr[left];
		arr[left] = arr[right];
		arr[right] = store;
		usingRecurssion(arr, ++left, --right);
	}
}
