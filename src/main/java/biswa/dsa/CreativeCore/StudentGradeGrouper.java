package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*  Given a list of students, filter out those who failed (score < 40) and
 *  group the passing students by their grade (A: 90–100, B: 80–89, etc.), 
 *  then return a map with grades as keys and lists of students as values.
 */
class Student {
    String name;
    int score;
    
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
public class StudentGradeGrouper {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			    new Student("Alice", 95),
			    new Student("Bob", 85),
			    new Student("Charlie", 75),
			    new Student("David", 45),
			    new Student("Eve", 30)
			);
		usingStreamApi(students);
		usingCollection(students);
	}
	
	public static void usingStreamApi(List<Student> students) {
		Map<String, List<String>> mapList = students.stream().collect(Collectors.toMap(
				key -> {
					if(key.getScore() > 90)
						return "A";
					else if(key.getScore() > 60 && key.getScore() <= 90)
						return "B";
					else if(key.getScore() > 40 && key.getScore() <=60)
						return "C";
					else
						return "Fail";
				},
				value -> new ArrayList<>(Arrays.asList(value.getName())),
				(val1, val2) -> {
					val1.addAll(val2);
					return val1;
				}
				));
		System.out.println(mapList);
	}
	
	public static void usingCollection(List<Student> students) {
		Map<String, List<String>> map = new HashMap<>();
		for(Student stud : students) {
//			if(stud.getScore() > 40) {
				List<String> list = new ArrayList<>();
				if(stud.getScore() > 90) {
					if(map.containsKey("A"))
						list.addAll(map.get("A"));
					list.add(stud.getName());
					map.put("A", list);
				} else if(stud.getScore() > 60 && stud.getScore() <= 90) {
					if(map.containsKey("B"))
						list.addAll(map.get("B"));
					list.add(stud.getName());
					map.put("B", list);
				} else if(stud.getScore() > 40 && stud.getScore() <= 60) {
					if(map.containsKey("C"))
						list.addAll(map.get("C"));
					list.add(stud.getName());
					map.put("C", list);
				} else {
					if(map.containsKey("Fail"))
						list.addAll(map.get("Fail"));
					list.add(stud.getName());
					map.put("Fail", list);
				}
//			}
		}
		System.out.println(map);
	}
}
