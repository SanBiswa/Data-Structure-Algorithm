package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 *  Input: List<String> list = Arrays.asList("Hello","Hi","Are","Ate");
 *  Output: {2=[Hi], 3=[Are, Ate], 5=[Hello]}
 */
public class LengthOfCharacters {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Hi", "Are", "Ate");
		usingStreamAPIApproach1(list);
		usingStreamAPIApproach2(list);
		usingCoreJavaApproach1(list);
		usingCoreJavaApproach2(list);
	}

	public static void usingStreamAPIApproach1(List<String> list) {
		Map<Integer, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(g -> g.length(), Collectors.toList()));

		System.out.println(map);
	}

	public static void usingStreamAPIApproach2(List<String> list) {
		Map<Integer, List<String>> map = list.stream()
				.collect(Collectors.toMap(
						str -> str.length(),
						str -> new ArrayList<>(Arrays.asList(str)),
						(str1, str2) -> {
							str1.addAll(str2);
							return str1;
						}
						));

		System.out.println(map);
	}

	public static void usingCoreJavaApproach1(List<String> list) {
		Map<Integer, List<String>> map = new HashMap<>();
		for (String str : list) {
			List<String> lst = new ArrayList<>();
			lst.add(str);
			lst.addAll(map.getOrDefault(str.length(), new ArrayList<>()));
			map.put(str.length(), lst);
		}
		System.out.println(map);
	}

	public static void usingCoreJavaApproach2(List<String> list) {
		Map<Integer, List<String>> map = new HashMap<>();
		for (String str : list) {
			if (!map.containsKey(str.length())) {
				map.put(str.length(), Arrays.asList(str));
			} else {
				List<String> lst = new ArrayList<>();
				lst.add(str);
				lst.addAll(map.get(str.length()));
				map.put(str.length(), lst);
			}
		}
		System.out.println(map);
	}
}
