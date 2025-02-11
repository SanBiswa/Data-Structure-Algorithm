package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/* Create a stream of pairs (key, value), where some keys may be duplicated.
 * Collect the pairs into a map where keys are unique and if there's 
 * a conflict (duplicate key), concatenate the values.
 */
public class KeyValueConflictResolver {

	public static void main(String[] args) {
		List<Map<String, String>> pairs = Arrays.asList(
				Map.of("a", "apple"), 
				Map.of("b", "banana"),
				Map.of("a", "avocado"), 
				Map.of("c", "cherry"));

		usingStreamApi(pairs);
		usingCollection(pairs);
	}

	public static void usingStreamApi(List<Map<String, String>> pairs) {
		Map<String, String> map = pairs.stream().flatMap(f -> f.entrySet().stream())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (val1, val2) -> val1 + " & " + val2));
		System.out.println(map);
	}

	public static void usingCollection(List<Map<String, String>> pairs) {
		Map<String, String> res = new HashMap();
		for (Map<String, String> map : pairs)
			for (Entry<String, String> entry : map.entrySet())
				if (res.containsKey(entry.getKey()))
					res.put(entry.getKey(), res.get(entry.getKey()) + " & " + entry.getValue());
				else
					res.put(entry.getKey(), entry.getValue());

		System.out.println(res);
	}
}
