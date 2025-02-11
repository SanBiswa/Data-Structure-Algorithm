package biswa.dsa.CreativeCore;

import java.util.stream.IntStream;

/* Create an infinite stream of integers starting from 1, and find the
 * first number greater than 1,000 that is divisible by both 5 and 7.
 */
public class InfiniteStreamMatcher {

	public static void main(String[] args) {
		usingStreamApi();
	}

	public static void usingStreamApi() {
		int num = IntStream.iterate(1000, n -> n + 1).filter(f -> f > 1000).filter(f -> (f % 5 == 0 && f % 7 == 0))
				.findFirst().getAsInt();
		System.out.println(num);
		
		int sum = IntStream.of(1,2,3,4,5).map(m -> m+1).reduce((v1,v2) -> v1+v2).getAsInt();
		System.out.println(sum);
	}
}
