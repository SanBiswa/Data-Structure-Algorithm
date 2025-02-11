package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * Given an array arr[] of N distinct elements and a number K, where K is smaller than the size of the array.
 * Find the K’th smallest element in the given array.
 * 
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
 * Output: 7
 * 
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
 * Output: 10 
 */
public class KthSmallestElement {

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 4;
		approach1(arr, k);
		approach2(arr, k);
	}

	// TC: O(n log n)
	static void approach1(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println(arr[k - 1]);
	}

	// TC: O(n log k)
	static void approach2(int[] arr, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
		for (int i : arr) {
			queue.offer(i);
			if (queue.size() > k)
				queue.poll();
		}
		System.out.println(queue.peek());
	}
}
