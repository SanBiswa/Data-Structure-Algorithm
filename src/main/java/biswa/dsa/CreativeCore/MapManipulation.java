package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*	Input: List<String> list = Arrays.asList("EPAM","EPAM2","Infy1","Infy4");
 *  Output: {E=EPAM2, I=Infy4}
 */
public class MapManipulation {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("EPAM", "EPAM2", "Infy1", "Infy4");
		usingCollection(list);
		usingStreamAPI(list);
	}

	public static void usingCollection(List<String> list) {
		Map<String, String> map = new HashMap<>();
		for (String str : list)
			map.put(str.substring(0, 1), str);
		System.out.println(map);
	}

	public static void usingStreamAPI(List<String> list) {
		Map<String, String> map = list.stream()
				.collect(Collectors.toMap(
						str -> str.substring(0, 1),
//						String::substring(0,1),
						String::new,
						(str1, str2) -> str2
						));
		System.out.println(map);
	}
}
