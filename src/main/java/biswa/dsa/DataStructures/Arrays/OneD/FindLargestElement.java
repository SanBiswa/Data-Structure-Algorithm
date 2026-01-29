package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

/*
 * Given an unsorted array find the largest element in the array.
 * Input: [1, 9, 45, 6, 7, 2, -25, 21]
 * Output: 45
 * 
 */
public class FindLargestElement {

	public static void main(String[] args) {
		int[] inputArr = {1, 9, 45, 6, 7, 2, -25, 21};
		
		approach1(inputArr);
		approach2(inputArr);
	}
	
	// TC: O(n log n)
	// SC: O(n)
	public static void approach1(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1]);
	}
	
	// TC: O(n)
	// SC: O(1)
	public static void approach2(int[] arr) {
		int largest = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		System.out.println(largest);
	}

}
