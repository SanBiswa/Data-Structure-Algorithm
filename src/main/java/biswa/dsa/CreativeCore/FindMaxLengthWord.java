package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* Given a list of words, find the word with the maximum length. 
 * If there are multiple words with the same length, return the first one.
 */
public class FindMaxLengthWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "data");
		usingStreamApiApproach1(words);
		usingStreamApiApproach2(words);
		usingStreamApiApproach3(words);
		usingCoreJava(words);
	}

	public static void usingStreamApiApproach1(List<String> words) {
		String word = words.stream().reduce((a, b) -> b.length() > a.length() ? b : a).stream().findFirst().get();
		System.err.println(word);
	}

	public static void usingStreamApiApproach2(List<String> words) {
		String word = words.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(word);
	}

	public static void usingStreamApiApproach3(List<String> words) {
		String word = words.stream().sorted(Comparator.comparingInt(String::length).reversed()).findFirst().get();
		System.err.println(word);
	}

	public static void usingCoreJava(List<String> words) {
		String word = "";
		for (String w : words)
			if (w.length() > word.length())
				word = w;

		System.out.println(word);
	}
}
