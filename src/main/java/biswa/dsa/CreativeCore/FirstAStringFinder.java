package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* Write a program that finds the first element in a list of strings
 * that starts with the letter 'A'. Return the string wrapped in an Optional.
 */
public class FirstAStringFinder {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Banana", "Apple", "Cherry", "Avocado");
		usingStreamApi(strings);
		usingCoreJava(strings);
	}

	public static void usingStreamApi(List<String> strings) {
		Optional<String> optional = strings.stream().filter(f -> f.startsWith("A")).findFirst();
		System.out.println(optional.orElse("No Value Present."));
	}

	public static void usingCoreJava(List<String> strings) {
		String res = "No Value Present.";
		for (String str : strings)
			if (str.startsWith("A")) {
				res = str;
				break;
			}

		System.out.println(res);
	}
}
