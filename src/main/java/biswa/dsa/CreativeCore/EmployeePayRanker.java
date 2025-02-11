package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Given a list of employees, sort them by their salaries in descending order.
 * If two employees have the same salary, sort them alphabetically by their name.
 */
class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class EmployeePayRanker {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Vikram", 50000), new Employee("Alice", 50000),
				new Employee("Bob", 60000), new Employee("Charlie", 50000), new Employee("Lily", 70000),
				new Employee("David", 70000));

		usingStreamApi(employees);
		System.out.println("---------------------");
		usingCollection(employees);
	}

	public static void usingStreamApi(List<Employee> employees) {
		employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
						.thenComparing(Comparator.comparing(Employee::getName)))
				.forEach(e -> System.out.println(e.getName() + " ==> " + e.getSalary()));
	}

	public static void usingCollection(List<Employee> employees) {
		Collections.sort(employees,
				Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName));
		employees.forEach(f -> System.out.println(f.getName() + " >> " + f.getSalary()));
	}
}
