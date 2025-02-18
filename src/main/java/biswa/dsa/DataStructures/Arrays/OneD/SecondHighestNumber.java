package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;

/*
 * Input: [6, 2, 1, 5, 4, 3]
 * Output: 5
 */
public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] arr = {4, 6, 4, 3, 2, 1};

		approach1(arr);
		approach2(arr);
	}
	
	public static void approach1(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = max;
		for(int i : arr) {
			if(i > max) {
				secondMax = max;
				max = i;
			} else if(i > secondMax) {
				secondMax = i;
			}
		}
		System.out.println(secondMax);
	}
	
	public static void approach2(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
