package test.test2.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(2, "xbc"), new Employee(1, "abc"), new Employee(3, "and"));

		System.out.println(list.stream().sorted((Employee e1, Employee e2) -> (e1.name.compareTo(e2.name)))
				.collect(Collectors.toList()));

		List<String> list1 = Arrays.asList("abc", "abc", "ddd", "ddd");

		List<String> set = list1.stream().distinct().collect(Collectors.toList());

		System.out.println(set);
	}
}

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}