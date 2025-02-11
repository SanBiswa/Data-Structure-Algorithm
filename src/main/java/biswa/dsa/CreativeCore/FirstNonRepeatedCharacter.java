package biswa.dsa.CreativeCore;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String s = "racecars";
		usingStreamApi(s);
		usingCollection(s);
	}

	static void usingStreamApi(String s) {
		Character character = s.chars().mapToObj(m -> (char) m)
				.collect(Collectors.groupingBy(g -> g, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(f -> f.getValue() == 1).limit(1).map(m -> m.getKey()).findFirst().get();
		System.out.println(character);
	}

	static void usingCollection(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (Character ch : s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		for (Map.Entry<Character, Integer> entry : map.entrySet())
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
	}
}
