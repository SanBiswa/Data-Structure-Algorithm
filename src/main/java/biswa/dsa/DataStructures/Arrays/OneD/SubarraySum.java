package biswa.dsa.DataStructures.Arrays.OneD;

/*
 * Given a 1-based indexing array arr[] of integers and an integer sum. You mainly need to return the left and right 
 * indexes(1-based indexing) of that subarray. In case of multiple subarrays, return the subarray indexes which come 
 * first on moving from left to right. If no such subarray exists return an array consisting of element -1.
 * 
 * Input: arr[] = { 15, 2, 4, 8, 9, 5, 10, 23}, sum = 23
 * Output: 2 5
 * Explanation: Sum of elements between indices 2 and 5 is 2 + 4 + 8 + 9 = 23
 * 
 * Input: arr[] = {1, 4}, sum = 0
 * Output: -1
 * Explanation: There is no subarray with 0 sum
 */
public class SubarraySum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 0, 0, 3, 10, 5 };
		int sum = 24;
		approach1(arr, sum);
		approach2(arr, sum);
	}

	// TC: O(n^2)
	static void approach1(int[] arr, int sum) {
		int left = -1, right = -1;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				count += arr[j];
				if (count == sum) {
					right = arr[j];
					left = arr[i];
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
		if (left != -1)
			System.out.println(left + ", " + right);
		else
			System.out.println(left);
	}

	// TC: O(n)
	static void approach2(int[] arr, int sum) {/// 1, 4, 0, 0, 3, 10, 5
		int left = 0, right = -1, count = 0;
		for (int i : arr) {
			count += i;
			if (count == sum) {
				right = i;
				break;
			} else if (count > sum) {
				count -= arr[left];
				if (count == sum && i <= sum) {
					left++;
					right = i;
					break;
				}
				left++;
			}
		}
		if (right == -1)
			System.out.println(-1);
		else
			System.out.println(arr[left] + ", " + right);
	}
}
