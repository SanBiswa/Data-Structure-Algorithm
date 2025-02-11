package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/* You have a list of students, each with a list of courses they are enrolled in. 
 * Flatten this structure to get a list of all courses, without duplicates.
 */
class Students {
	String name;
	List<String> courses;

	public Students(String name, List<String> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
}

public class UniqueCourceExtractor {

	public static void main(String[] args) {
		List<Students> students = Arrays.asList(new Students("John", Arrays.asList("Math", "Physics")),
				new Students("Jane", Arrays.asList("Math", "Biology")),
				new Students("Bob", Arrays.asList("History", "Physics")));
		usingStreamApiApproach1(students);
		usingStreamApiApproach2(students);
		usingCollectionApproach1(students);
		usingCollectionApproach2(students);
	}

	public static void usingStreamApiApproach1(List<Students> students) {
		Set<String> set = students.stream().flatMap(m -> m.getCourses().stream()).collect(Collectors.toSet());
		System.out.println(set);
	}

	public static void usingStreamApiApproach2(List<Students> students) {
		List<String> list = students.stream().flatMap(m -> m.getCourses().stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(list);
	}

	public static void usingCollectionApproach1(List<Students> students) {
		Set<String> set = new HashSet<>();
		for (Students stud : students)
			set.addAll(stud.getCourses());

		System.out.println(set);
	}

	public static void usingCollectionApproach2(List<Students> students) {
		Set<String> set = new HashSet<>();
		for (Students stud : students)
			for (String str : stud.getCourses())
				set.add(str);

		System.out.println(set);
	}
}
