package biswa.dsa.CreativeCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Given a list of Employee objects with fields id, name, and salary, 
 * filter out all employees whose salary is less than a threshold, 
 * sort the remaining employees by salary in descending order, 
 * and collect the result into a new list.
 */
class Employees {
	int id;
	String name;
	double salary;

	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

public class HighSalaryEmployeeProcessor {

	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(new Employees(1, "Alice", 50000), new Employees(2, "Bob", 60000),
				new Employees(3, "Charlie", 40000), new Employees(2, "Gem", 30000), new Employees(3, "Sham", 45000),
				new Employees(3, "John", 90000));

		usingStreamApi(employees);
		System.out.println("-------------------");
		usingCollection(employees);
	}

	public static void usingStreamApi(List<Employees> employees) {
		employees.stream().filter(f -> f.getSalary() > 45000)
				.sorted(Comparator.comparing(Employees::getSalary).reversed())
				.forEach(f -> System.out.println(f.getName() + " => " + f.getSalary()));
	}

	public static void usingCollection(List<Employees> employees) {
		List<Employees> list = new ArrayList<>();
		for (Employees emp : employees)
			if (emp.getSalary() > 45000)
				list.add(emp);

		Collections.sort(list, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
		list.forEach(f -> System.out.print(f.getName() + " >> " + f.getSalary() + "\n"));
	}
}
