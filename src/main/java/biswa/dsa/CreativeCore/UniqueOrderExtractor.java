package biswa.dsa.CreativeCore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*  Given a list of customers, each with a list of orders, flatten the structure
 *  to get a list of all unique products ordered across all customers.
 */
class Customer {
	String name;
	List<Order> orders;

	public Customer(String name, List<Order> orders) {
		super();
		this.name = name;
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}

class Order {
	List<String> products;

	public Order(List<String> products) {
		super();
		this.products = products;
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}
}

public class UniqueOrderExtractor {

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
			    new Customer("John", Arrays.asList(new Order(Arrays.asList("Phone", "Laptop")), new Order(Arrays.asList("Tablet")))),
			    new Customer("Jane", Arrays.asList(new Order(Arrays.asList("Laptop", "Headphones")), new Order(Arrays.asList("Phone")))),
			    new Customer("Tom", Arrays.asList(new Order(Arrays.asList("Camera", "Headphones"))))
			);

		usingStreamApi(customers);
		System.out.println();
		usingCollection(customers);
	}
	
	public static void usingStreamApi(List<Customer> customers) {
		customers.stream().flatMap(f -> f.getOrders().stream()).flatMap(f -> f.getProducts().stream())
		.distinct().forEach(f -> System.out.print(f + ", "));
	}
	
	public static void usingCollection(List<Customer> customers) {
		Set<String> set = new LinkedHashSet<>();
		for(Customer cust : customers)
			for(Order order : cust.getOrders())
				for(String str : order.getProducts())
					set.add(str);
					
		System.out.println(set);
	}
}
