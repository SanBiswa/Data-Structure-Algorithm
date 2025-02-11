package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Given a list of employee's having age and name. You need to find out 3 unique surname employee
 * who's age is above 30 and need to print full name where surname will be upper case.
 */
public class EmployeeAgeSurnameFilter {

	private Integer age;
	private String name;

	public EmployeeAgeSurnameFilter(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		List<EmployeeAgeSurnameFilter> list = new ArrayList<>(Arrays.asList(
				new EmployeeAgeSurnameFilter(50, "Sachin Tendulkar"),
				new EmployeeAgeSurnameFilter(45, "MS Dhoni"),
				new EmployeeAgeSurnameFilter(35, "Virat Kohli"),
				new EmployeeAgeSurnameFilter(39, "ABCD Kohli"),
				new EmployeeAgeSurnameFilter(36, "Rohit Sharma"),
				new EmployeeAgeSurnameFilter(25, "Rishav Pant")));
		employeeFilter(list);
	}

	static void employeeFilter(List<EmployeeAgeSurnameFilter> list) {
		Set<String> set = new HashSet<>();
		list.stream().filter(f -> f.getAge() > 30).map(m -> {
			String[] str = m.getName().split(" ");
			String res = "";
			if(set.add(str[str.length-1])) {
				for(int i=0; i<str.length-1; i++)
					res += str[i] + " ";
				res += str[str.length-1].toUpperCase();
			}
			return res;
		}).limit(3).forEach(System.out::println);
	}
}
