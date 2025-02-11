package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;

/* Given a list of integers, filter out all odd numbers, 
 * square the even numbers, and then return the sum of all the squared values.
 */
public class FindAllEvenSuqaredSum {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		usingStreamApi(numbers);
		usingCoreJava(numbers);
	}
	
	public static void usingStreamApi(List<Integer> list) {
		Integer sum = list.stream().filter(f -> f % 2 == 0).map(m -> m*m).reduce(0, (a,b) -> a+b);
		System.err.println(sum);
	}
	
	public static void usingCoreJava(List<Integer> list) {
		int sum = 0;
		for(Integer i : list) {
			if(i % 2 == 0) {
				sum += i*i;
			}
		}
		System.out.println(sum);
	}
}
