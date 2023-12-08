package com.demo.test;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;

public class HashSetInterview {

	public static void main(String[] args) {
		HashSet<Students> set = new HashSet<>();
		Students s1 = new Students(111, "2");
		Students s2 = new Students(2, "2");
		Students s4 = new Students(4, "4");

		set.add(s1);
		set.add(s2);
		set.add(s4);
		System.out.println(set.size());
		s4.id=1;
		System.out.println(set.size());
		
		TreeMap<Students, Integer> treemap = new TreeMap<>(Comparator.comparingInt(s -> s.id));
		treemap.put(s1,112);
		treemap.put(s2,112);

		System.out.println(treemap);
	}
}


class Students {
	int id;
	String name;

	Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Students other = (Students) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Students id=" + id + ", name=" + name + "";
	}
	
	

}