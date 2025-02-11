package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import biswa.dsa.Utill.Person;

/* Given a list of people (with name and age), group them by age 
 * and collect the names of people with the same age into a list.
 */

public class AgeGroupCollector {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			    new Person("Alice", 30),
			    new Person("Bob", 25),
			    new Person("Charlie", 25),
			    new Person("David", 30)
			);
		usingStreamApi((List<Person>) people);
		usingCollection(people);
	}
	
	public static void usingStreamApi(List<Person> people) {
		Map<Integer, List<String>> mapList = people.stream().collect(Collectors.toMap(
				Person::getAge,
				value -> new ArrayList<>(Arrays.asList(value.getName())),
				(val1, val2) -> {
					val1.addAll(val2);
					return val1;
				}
				));
		System.out.println(mapList);
	}
	
	public static void usingCollection(List<Person> people) {
		Map<Integer, List<String>> map = new HashMap<>();
		for (Person person : people) {
			List<String> list = new ArrayList<>();
			list.addAll(map.getOrDefault(person.getAge(), new ArrayList<>()));
			list.add(person.getName());
			map.put(person.getAge(), list);
		}
		System.out.println(map);
	}
}