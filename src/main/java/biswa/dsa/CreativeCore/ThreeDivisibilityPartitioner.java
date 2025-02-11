package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Given a list of numbers, partition them into two lists: 
 * one containing numbers divisible by 3 and 
 * the other containing the remaining numbers.
 */
public class ThreeDivisibilityPartitioner {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 9, 10, 15, 20, 30, 35);
		usingStreamApi(numbers);
		usingCollection(numbers);
	}

	public static void usingStreamApi(List<Integer> numbers) {
		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(p -> p % 3 == 0));
		System.out.println("Divisible: " + map.get(true) + "\nNot Divisible: " + map.get(false));
	}

	public static void usingCollection(List<Integer> numbers) {
		List<Integer> divisible = new ArrayList<>();
		List<Integer> notDvisible = new ArrayList<>();
		for (Integer num : numbers) {
			if (num % 3 == 0)
				divisible.add(num);
			else
				notDvisible.add(num);
		}
		System.out.println("Divisible: " + divisible + "\nNot Divisible: " + notDvisible);
	}
}
