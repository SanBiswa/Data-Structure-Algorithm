package biswa.dsa.DataStructures.Arrays.OneD;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Given an array, find the majority element in the array. If no majority exists, return -1. A majority element 
 * in an array is an element that appears strictly more than arr.size() / 2 times in the array.
 * 
 * Input : arr[] = {1, 1, 2, 1, 3, 5, 1}
 * Output : 1
 * Explanation: Note that 1 appear 4 times which is more than  7 / 2 times
 * 
 * Input : arr[] = {3, 3, 4, 2, 4, 4, 2, 4}
 * Output :  -1 
 * Explanation: There is no element whose frequency is greater than the half of the size of the array size.
 * 
 * Input : arr[] = {3}
 * Output : 3
 * Explanation: Appears more than n/2 times
 */
public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 1, 3, 5, 1};
		approach1(arr);
		approach2(arr);
		approach3(arr);
		approach4(arr);
	}

	// TC: n + n + n^2 + 1 => 2n + n^2 + 1 => O(n^2)
	public static void approach1(int[] arr) {
		Optional<Integer> optional = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(g -> g, Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByValue()).filter(f -> f.getValue() > arr.length / 2).map(m -> m.getKey())
				.findFirst();

		optional.ifPresentOrElse(val -> System.out.println(val), () -> System.out.println(-1));
	}

	// TC: n + n => 2n => O(n)
	public static void approach2(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int mid = arr.length / 2, max = -1;
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);

			if (map.get(i) > mid && map.get(i) > max)
				max = i;
		}

//		for (Map.Entry<Integer, Integer> entry : map.entrySet())
//			if (entry.getValue() > mid && entry.getValue() > max)
//				max = entry.getKey();
		System.out.println(max);
	}

	// TC: O(n log n)
	public static void approach3(int[] arr) {
		int mid = arr.length / 2, max = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > mid)
				max = arr[i];
		}
		System.out.println(max);
	}

	// TC: n^2 + n => O(n^2)
	public static void approach4(int[] arr) {
		Arrays.sort(arr);
		int mid = arr.length / 2, max = -1, store = arr[0], count = 0;
		for (int i : arr) {
			if (store == i)
				count++;
			else
				count = 0;
			
			if (count > mid && count > max)
				max = i;
		}
		System.out.println(max);
	}
}
