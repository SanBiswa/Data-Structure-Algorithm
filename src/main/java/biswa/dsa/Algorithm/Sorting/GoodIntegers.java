package biswa.dsa.Algorithm.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Given N array integers, you need to calculate no of good integers.
 * An element said to be good if it has same no of elements less than it self.
 */
public class GoodIntegers {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 2, 2};
		// -1, -4, 3, 5, -15, 4
		// 0, 1, 2, 2, 2, 2, 2

		approach1(arr);
		approach2(arr);
	}

	// TC: O(N^2)
	// TC: O(N)
	public static void approach1(int[] arr) {
		int goodCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[i])
					count++;
			}
			if (count == arr[i])
				goodCount++;
		}
		System.out.println(goodCount);
	}

	// TC: O(NlogN) (Arrays.sort())
	// SC: O(N) (Arrays.sort())
	public static void approach2(int[] arr) {
		Arrays.sort(arr);
		int goodCount = 0;
		int repeat = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) 
				repeat = i;
//				if (arr[i] == i)
//				 count++;
			
			
			if (arr[i] == repeat)
				goodCount++;
//			else if(repeat == arr[i] && repeat == count)
//				goodCount++;
		}
		System.out.println(goodCount);
	}

}
