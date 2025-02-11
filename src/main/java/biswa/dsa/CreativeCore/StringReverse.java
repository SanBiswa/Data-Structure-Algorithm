package biswa.dsa.CreativeCore;

import java.util.Collections;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		String str = "abc &*123)(@ bc d";
		usingStreamApi(str);
		usingCoreJava(str);
	}

	static void usingStreamApi(String str) {
		String res = str.chars().mapToObj(m -> (char) m)
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream();
				})).map(String::valueOf).collect(Collectors.joining());
		
		System.out.println(res);
	}

	static void usingCoreJava(String str) {
		int length = str.length();
		for (int i = str.length() - 1; i >= 0; i--)
			str += str.charAt(i);

		System.out.println(str.substring(length));
	}
}
