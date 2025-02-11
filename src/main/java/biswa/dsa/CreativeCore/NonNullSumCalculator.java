package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* This name clearly indicates the purpose of the class: to calculate the sum of non-null integers
 * using parallel execution, emphasizing the handling of the parallel operation and non-null condition.
 */
public class NonNullSumCalculator {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 5);
		usingStreamApiApproach1(numbers);
		usingStreamApiApproach2(numbers);
		usingStreamApiApproach3(numbers);
		usingParallelStreamApi(numbers);
	}

	public static void usingStreamApiApproach1(List<Integer> list) {
		int sum = list.stream().filter(f -> f != null).reduce(Integer::sum).get();
		System.out.println(sum);
	}

	public static void usingStreamApiApproach2(List<Integer> list) {
		int sum = list.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	public static void usingStreamApiApproach3(List<Integer> list) {
		int sum = list.stream().filter(Objects::nonNull).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
	}

	public static void usingParallelStreamApi(List<Integer> list) {
		int sum = list.parallelStream().filter(f -> f != null).reduce(Integer::sum).get();
		System.out.println(sum);
	}
}
