package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given a list of integers, find the first duplicate element using the Stream API.*/

public class FindFirstDuplicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 1, 7);

		usingStreamApi(numbers);
		usingCollection(numbers);
	}

	public static void usingStreamApi(List<Integer> numbers) {
		Set<Integer> set = new HashSet<>();
		String duplicate = numbers.stream().filter(f -> !set.add(f)).map(m -> m.toString()).findFirst().get();
//				.map(Integer::parseInt).get();
		System.out.println(duplicate);
	}

	public static void usingCollection(List<Integer> numbers) {
		Set<Integer> set = new HashSet<>();
		for (Integer i : numbers) {
			if (!set.add(i)) {
				System.out.println(i);
				break;
			}
		}
	}

}
