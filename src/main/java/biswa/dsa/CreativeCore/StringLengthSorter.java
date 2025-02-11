package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* Sort a list of strings by their length descending order. If two strings 
 * have the same length, sort them alphabetically.
 */
public class StringLengthSorter {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("pear", "apple", "kiwi", "cherry", "banana", "blueberry");
		usingStreamApi(words);
	}

	public static void usingStreamApi(List<String> words) {
		List<String> sortedStrings = words.stream()
				.sorted(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList());
		System.out.println(sortedStrings);
	}
}
