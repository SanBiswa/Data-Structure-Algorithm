package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Given a list of 10 names, skip the 1st 3 names and last 3 names only get the middle 4 names */
public class LimitSkipStream {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "George", "Helen",
				"John", "Smith");
		usingStreamApi(names);
		usingCoreJava(names);
	}

	public static void usingStreamApi(List<String> names) {
		List<String> list = names.stream().skip(3).limit(4).collect(Collectors.toList());
		System.out.println(list);
	}

	public static void usingCoreJava(List<String> names) {
		for (int i = 3; i < names.size() - 3; i++)
			System.out.print(names.get(i) + ", ");
	}
}
