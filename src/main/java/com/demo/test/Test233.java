package com.demo.test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test233 {
	
	public static void main(String[] args) {
		
		String str ="bengbaluruee";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (/* str.indexOf(ch) == i && */str.lastIndexOf(ch) == i) {
				System.out.println((char) ch);
				return;
			}
		}
		
		
		List<Employee> list = new ArrayList<>();
		
		
		list.stream().filter(e -> e.equals("HR")).
		sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
		
		
		List<Employee> sortedList = list.stream()
			    .filter(e -> e.equals("HR"))
			    .sorted(Comparator.comparingInt(Employee::getSalary))
			    .collect(Collectors.toList());

		
		//str.chars().mapToObj(ch-> (char) ch).collect()
	}

}
//max salary of hr dept
class Employee{

	int id;
	int salary;
	String deptName= "hr";
	String getDepartment(){
		return deptName;
	}
	
	public int getSalary() {
		return 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}

