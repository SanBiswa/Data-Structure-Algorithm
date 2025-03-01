package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

/*
 * Given an integer array arr[], print all distinct elements from this array. The given array may 
 * contain duplicates and the output should contain every element only once.
 * 
 * Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
 * Output: {12, 10, 9, 45, 2}
 * 
 * Input: arr[] = {1, 2, 3, 4, 5}
 * Output: {1, 2, 3, 4, 5}
 */
public class FindDistinct {

	public static void main(String[] args) {
		int[] arr = { 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45, 12, 10, 9, 45, 2, 10, 10, 45 };
		approach1(arr);
		System.out.println("------------------------------");
		approach2(arr);
	}

	// TC: O(n)
	public static void approach1(int[] arr) {
		long start = System.currentTimeMillis();
		Set<Integer> set = new LinkedHashSet<>();
		for (int i : arr)
			set.add(i);
		System.out.println(set);
		long end = System.currentTimeMillis();
		System.out.println("strat: "+ start);
		System.out.println("end: "+ end);
		System.out.println(end - start);
	}
	
	// TC: O(n) AC, O(n2) WC
	public static void approach2(int[] arr) {
		long start = System.currentTimeMillis();
		Arrays.stream(arr).distinct().forEach(s -> System.out.print(s +", "));
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println("strat: "+ start);
		System.out.println("end: "+ end);
		System.out.println(end - start);
	}
}
