package biswa.dsa.CreativeCore;

import java.util.stream.IntStream;

/* You have a stream of 1 million integers. You need to find the sum of all numbers
 * greater than 500,000. Which is more efficient: filtering first and then summing,
 * or summing first and then filtering? Explain why.
 */
public class OptimizedStreamSum {

	public static void main(String[] args) {
		usingStreamApiApproach1();
		usingStreamApiApproach2();
	}

	public static void usingStreamApiApproach1() {
		int sum = IntStream.range(500000, 1000000).filter(num -> num > 500000).sum();
		System.out.println(sum);
	}

	public static void usingStreamApiApproach2() {
		int sum = IntStream.range(500000, 1000000).reduce(0, (res, num) -> num > 500000 ? res + num : res);
		System.out.println(sum);
	}
}
