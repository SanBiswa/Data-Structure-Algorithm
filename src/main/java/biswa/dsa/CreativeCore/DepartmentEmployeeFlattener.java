package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Given a list of departments, each having a list of employees, 
 * flatten the structure into a list of all employee names.
 */

class Employeee {
	String name;

	public Employeee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Department {
	String name;
	List<Employeee> employees;

	public Department(String name, List<Employeee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employeee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employeee> employees) {
		this.employees = employees;
	}
}

public class DepartmentEmployeeFlattener {

	public static void main(String[] args) {
		List<Department> departments = Arrays.asList(
				new Department("HR",
						Arrays.asList(new Employeee("Biswa"), new Employeee("Ranjan"), new Employeee("Sahoo"))),
				new Department("IT",
						Arrays.asList(new Employeee("Sujit"), new Employeee("Kumar"), new Employeee("Behera"))),
				new Department("Finance",
						Arrays.asList(new Employeee("Kirtti"), new Employeee("Ranjan"), new Employeee("Behuria"))));
		usingStreamApi(departments);
	}

	public static void usingStreamApi(List<Department> departments) {
		List<String> nameList = departments.stream().flatMap(f -> f.getEmployees().stream())
				.map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(nameList);
	}

}
