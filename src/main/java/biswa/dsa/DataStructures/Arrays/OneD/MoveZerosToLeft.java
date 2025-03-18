package biswa.dsa.DataStructures.Arrays.OneD;

import biswa.dsa.Utill.IterationHelper;

/*
 * Input:  { 4, 0, 1, 0, 6, 0, 9, 0, 0, 18 }
 * Output: { 0, 0, 0, 0, 0, 4, 1, 6, 9, 18 }
 */
public class MoveZerosToLeft {

	public static void main(String[] args) {
		approach1(createNewArray());
		approach2(createNewArray());
		approach3(createNewArray());
	}

	public static int[] createNewArray() {
		return new int[] { 4, 0, 1, 0, 6, 0, 9, 0, 0, 18 };
	}

	// TC: O(N)
	public static void approach1(int[] arr) {
		int right = arr.length - 1;
		for (int i = right; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[right] = arr[i];
				if (i != right) {
					arr[i] = 0;
				}
				right--;
			}
		}
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	// TC: O(N)
	public static void approach2(int[] arr) {
		int[] temp = new int[arr.length];
		int zeroCount = 0;
		for (int i : arr)
			if (i == 0)
				zeroCount++;

		for (int i : arr) {
			if (i != 0) {
				temp[zeroCount++] = i;
			}
		}
//		arr = temp;
		IterationHelper.iterateIntegerArray(temp, "S");
	}

	// TC: O(N)
	public static void approach3(int[] arr) {
		approach3Recurssion(arr, arr.length - 1, arr.length - 1);
		IterationHelper.iterateIntegerArray(arr, "S");
	}

	public static void approach3Recurssion(int[] arr, int left, int right) {
		if (left < 0)
			return;
		if (arr[left] != 0) {
			arr[right] = arr[left];
			if (left != right)
				arr[left] = 0;
			right--;
		}
		approach3Recurssion(arr, --left, right);
	}
}
