package biswa.dsa.CreativeCore;

import java.util.stream.IntStream;

/* Input: 5
 * Output: 120
 */
public class FindFactorial {

	public static void main(String[] args) {
		int num = 5;
		usingCoreJava(num);
		usingStreamAPI(num);
	}

	public static void usingCoreJava(int num) {
		int sum = 1;
		while (num > 0) {
			sum *= num;
			num--;
		}
		System.out.println(sum);
	}

	public static void usingStreamAPI(int num) {
		Integer factorial = IntStream.range(1, num+1).reduce((a,b) -> a*b).getAsInt();
		System.out.println(factorial);
	}
}
