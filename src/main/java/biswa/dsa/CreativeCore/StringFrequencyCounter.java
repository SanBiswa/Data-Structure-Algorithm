package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Given a list of strings, count how many times each unique string appears.
 * Input: Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
 * Output: {apple: 3, banana: 2, cherry: 1}
 */
public class StringFrequencyCounter {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		usingStreamApiApproach1(strings);
		usingStreamApiApproach2(strings);
		usingCollectionAppraoch1(strings);
		usingCollectionAppraoch2(strings);
	}

	public static void usingStreamApiApproach1(List<String> strings) {
		Map<String, Long> map = strings.stream().collect(Collectors.groupingBy(g -> g, Collectors.counting()));
		System.out.println(map);
	}

	public static void usingStreamApiApproach2(List<String> strings) {
		Map<String, Integer> map = strings.stream().collect(Collectors.toMap(String::new, s -> 1, Integer::sum, LinkedHashMap::new));
		System.out.println(map);
	}

	public static void usingCollectionAppraoch1(List<String> strings) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String str : strings)
			map.put(str, map.getOrDefault(str, 0) + 1);
		System.out.println(map);
	}
	
	public static void usingCollectionAppraoch2(List<String> strings) {
		Map<String, Integer> map = new LinkedHashMap<>();
		strings.forEach(str -> map.merge(str, 1, Integer::sum));
		System.out.println(map);
	}
}