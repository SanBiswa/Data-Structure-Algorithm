package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Given an array of n integers. The task is to find all elements that have more than one occurrences.
 * The output should only one occurrence of a number irrespective of number of occurrences in the input array.
 * Input: {2, 10, 10, 100, 2, 10, 11, 2, 11, 2}
 * Output: {2, 10, 11}
 * 
 * Input: {5, 40, 1, 40, 100000, 1, 5, 1}
 * Output: {5, 40, 1}
 */
public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = { 5, 40, 1, 40, 100000, 1, 5, 1 };
		approach1(arr);
		approach2(arr);
		approach3(arr);
	}

	// TC: O(n)
	public static void approach1(int[] arr) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> res = new HashSet<>();
		for (int i : arr)
			if (!set.add(i))
				res.add(i);
		System.out.println(res);
	}

	// TC: O(n)
	public static void approach2(int[] arr) {
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(g -> g, Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() > 1).map(m -> m.getKey()).forEach(s -> System.out.print(s + ", "));
	}
	
	// TC: O(n log n)
	public static void approach3(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (list.contains(arr[i])) {
				arr[count++] = arr[i];
				list.remove(Integer.valueOf(arr[i]));
			} else {
				list.add(arr[i]);
			}
		}
		System.out.println();
		for (int i = count; i > 0; i--) {
			System.out.print(arr[i] + ", ");
		}
	}
}
