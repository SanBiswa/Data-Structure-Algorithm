package biswa.dsa.Algorithm.Recurssion;

import biswa.dsa.Utill.IterationHelper;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		IterationHelper.iterateIntegerArray(reverse(arr, 0, arr.length - 1), "S");
	}

	static int[] reverse(int[] arr, int left, int right) {
		if (left >= right)
			return arr;
		int store = arr[left];
		arr[left++] = arr[right];
		arr[right--] = store;
		reverse(arr, left, right);
		return arr;
	}
}