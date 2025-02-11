package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import biswa.dsa.Utill.Person;

/* Given a list of Person objects, find the average age
 * of people whose names start with a specific letter.
 */

public class AverageAgeByNameStarter {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Arjun", 25), new Person("Bob", 25),
				new Person("Biswa", 24), new Person("Charlie", 35), new Person("David", 40), new Person("Akhil", 30),
				new Person("Bikram", 29));

		usingStreamApi(people, "B");
		usingCollection(people, "A");
	}

	public static void usingStreamApi(List<Person> people, String prefix) {
		Double ageAvg = people.stream().filter(f -> f.getName().startsWith(prefix))
		.collect(Collectors.averagingDouble(a -> a.getAge()));
		System.out.println(ageAvg);
	}

	public static void usingCollection(List<Person> people, String prefix) {
		int count = 0;
		double age = 0;
		for (Person person : people) {
			if (person.getName().startsWith(prefix)) {
				count++;
				age += person.getAge();
			}
		}
		System.out.println(age / count);
	}
}
