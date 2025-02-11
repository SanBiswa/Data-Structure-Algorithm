package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Stack;

/*
 * Given an unsorted array, find a peak element in it. An element is considered to be peak if its value is greater 
 * than or equal to the values of its adjacent elements (if they exist). There can be more than one peak elements 
 * in an array, we return any of them,
 * Note: If the array is increasing then just print the last element will be the maximum value.
 * 
 * Input: arr[]= {5, 10, 20, 15}
 * Output: 20
 * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
 * 
 * Input: arr[] = {10, 20, 15, 2, 23, 90, 90}
 * Output: 20 or 90
 * Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 * 
 * Input: arr[] = [1, 1, 1]
 * Output : 1
 * Explanation:  All elements are peak in the given array, we can return any of them,
 */
public class FindPeakAdjacent {

	public static void main(String[] args) {
		int[] arr = {10, 20, 15, 2, 23, 90, 90};
		approach1(arr);
		approach2(arr);
	}
	
	// TC: O(n)
	static void approach1(int[] arr) {
		int peak = arr[1];
		for(int i=2; i< arr.length; i++) {
			if(arr[i-2] <= arr[i-1] && arr[i-1] >= arr[i])
				peak = arr[i-1];
		}
		System.out.println(peak);
	}
	
	// TC: n + n => 2n => O(n)
	static void approach2(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int i : arr)
			stack.add(i);
		int res = arr[0];
		while(stack.size() > 2) {
			int last = stack.pop();
			int mid = stack.peek();
			int first = stack.get(stack.size()-2);
			if(last <= mid && mid >= first)
				res = mid;
		}
		System.out.println(res);
	}
}
