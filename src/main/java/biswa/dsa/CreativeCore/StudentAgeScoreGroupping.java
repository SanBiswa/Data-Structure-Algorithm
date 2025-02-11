package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* Group a list of students by their age, and then by their score. 
 * How can you use Collectors.groupingBy() with nested Collectors?
 */
class Studentt {
	String name;
	int age;
	int score;

	public Studentt(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

public class StudentAgeScoreGroupping {

	public static void main(String[] args) {
		List<Studentt> students = Arrays.asList(
				new Studentt("Alice", 20, 85), 
				new Studentt("Bob", 21, 90),
				new Studentt("Charlie", 20, 75), 
				new Studentt("David", 21, 60));
		usingStreamApi(students);
//		usingCollection(students);// showing error, will do this latter
	}

	public static void usingStreamApi(List<Studentt> students) {
		Map<Object, Map<Object, List<Studentt>>> mapList = students.stream()
				.collect(Collectors.groupingBy(g -> g.getAge(), Collectors.groupingBy(g -> g.getScore())));
		mapList.forEach((age, scoreMap) -> {
			System.out.print(age + " --> ");
			scoreMap.forEach((key, value) -> {
				value.forEach(v -> System.out.print("{ "+ v.getName() +" Scores "));
				System.out.print(key + " }, ");
			});
			System.out.println();
		});
	}

	public static void usingCollection(List<Studentt> students) {
		Map<Integer, Map<Integer, List<Studentt>>> map = new HashMap<>();
		Map<Integer, List<Studentt>> listMap = new HashMap<>();
		for (Studentt stud : students) {
			if (map.containsKey(stud.getAge())) {
				List<Studentt> list = new ArrayList();
				list.addAll(listMap.get(stud.getScore()));
				list.add(stud);
				listMap.put(stud.getScore(), list);
				map.put(stud.getAge(), listMap);
			} else {
				listMap.put(stud.getScore(), new ArrayList<>(Arrays.asList(stud)));
				map.put(stud.getAge(), listMap);
			}
		}
		map.forEach((age, scoreMap) -> {
			System.out.println("Age: " + age);
			scoreMap.forEach((score, studentList) -> {
				System.out.println("  Score: " + score);
				studentList.forEach(student -> System.out.println("    " + student.getName()));
			});
		});
	}
}
