package com.demo.test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test0112 {
	public static void main(String[] args) {
		 TestFunction test = (int a)->  a*a;
//		 System.out.println( test.square(10));
		 
		 List<String> list1 = new ArrayList();
		 List<String> list2 = new ArrayList();
		 list1.add("a");
		 list1.add("b");
		 list2.add("a");
		 list2.add("b");
		 list2.add("c");

		 list1.addAll(list2);
		 
		 list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
					.stream().filter(entry -> entry.getValue() > 1).forEach( entry -> System.out.println(entry.getKey()));
	

			String str = null;
	        System.out.println(str.valueOf(10));
	        
	        String s1 = "abc";
	        StringBuffer s2 = new StringBuffer(s1);
	        System.out.println(s1.equals(s2));
	}
 
 
}
@FunctionalInterface
  interface Test2222<A, B, C>{
    public C apply(A a, B b);
  
    default void printString() {
        System.out.println("softwaretestinghelp");
    }
}

@FunctionalInterface
interface TestFunction{
 public int square(int x);
}