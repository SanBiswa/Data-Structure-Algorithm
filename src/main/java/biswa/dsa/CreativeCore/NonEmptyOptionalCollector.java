package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* Write a program that processes a list of Optional<String>, 
 * filters out the empty optional's, and collects the non-empty values into a list.
 */
public class NonEmptyOptionalCollector {

	public static void main(String[] args) {
		List<Optional<String>> optionals = Arrays.asList(Optional.of("Hello"), Optional.empty(), Optional.of("World"),
				Optional.empty());

		usingStreamApi(optionals);
		usingCollection(optionals);
	}

	public static void usingStreamApi(List<Optional<String>> optionals) {
		List<Optional<String>> list = optionals.stream().filter(f -> f.isPresent()).collect(Collectors.toList());
		list.forEach(f -> System.out.println(f.get()));
	}

	public static void usingCollection(List<Optional<String>> optionals) {
		List<Optional<String>> list = new ArrayList<>();
		for (Optional<String> optional : optionals)
			if (optional.isPresent())
				list.add(optional);

		list.forEach(f -> System.out.println(f.get()));
	}
}
