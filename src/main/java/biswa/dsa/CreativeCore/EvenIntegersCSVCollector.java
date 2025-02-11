package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Create a custom collector that converts a stream of integers 
 * into a comma-separated string, but only includes even numbers.
 */
public class EvenIntegersCSVCollector {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		usingtreamApi(numbers);
		usingCoreJava(numbers);
	}

	public static void usingtreamApi(List<Integer> numbers) {
		String str = numbers.stream().filter(f -> f % 2 == 0).map(m -> m.toString()).collect(Collectors.joining(", "));
		System.out.println(str);
	}
	
	public static void usingCoreJava(List<Integer> numbers) {
		StringBuffer sb = new StringBuffer();
		for(Integer i : numbers)
			if(i % 2 == 0)
				sb = sb.append(i.toString() + ", ");
		if(sb != null)
			System.out.println(sb.substring(0,sb.length()-2));
	}
}
