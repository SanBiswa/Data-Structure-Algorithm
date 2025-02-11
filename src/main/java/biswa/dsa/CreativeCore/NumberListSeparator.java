package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Given a list of integers, partition the list into two sublists: one containing numbers 
 * greater than 5 and the other containing numbers less than or equal to 5.
 */
public class NumberListSeparator {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 6, 8, 2, 5, 7, 1, 4);
		usingStreamApi(numbers);
		usingCoreJava(numbers);
	}

	public static void usingStreamApi(List<Integer> numbers) {
		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(num -> num <= 5));
		System.out.println("Less Than Equal To 5: " + map.get(true));
		System.out.println("Greater Than 5: " + map.get(false));
	}

	public static void usingCoreJava(List<Integer> numbers) {
		List<Integer> lessThanEqualTo5 = new ArrayList<>();
		List<Integer> greaterThan5 = new ArrayList<>();
		for (Integer i : numbers) {
			if (i <= 5)
				lessThanEqualTo5.add(i);
			else
				greaterThan5.add(i);
		}
		System.out.println("Less Than Equal To 5: " + lessThanEqualTo5);
		System.out.println("Greater Than 5: " + greaterThan5);
	}
}
