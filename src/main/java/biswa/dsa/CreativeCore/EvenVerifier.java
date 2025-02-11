package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;

/*  Write a program that checks if all elements in a list of integers are even.
 *  If at least one element is odd, return false.
 */
public class EvenVerifier {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
		usingStreamApi(numbers);
		usingCoreJava(numbers);
	}

	public static void usingStreamApi(List<Integer> numbers) {
		System.out.println(numbers.stream().filter(f -> f % 2 != 0).count() == 0);
	}

	public static void usingCoreJava(List<Integer> numbers) {
		boolean flag = true;
		for (Integer i : numbers)
			if (i % 2 != 0) {
				flag = false;
				break;
			}

		System.out.println(flag);
	}
}