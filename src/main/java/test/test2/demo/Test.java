package test.test2.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> country = Arrays.asList("Australia", "New zeland", "Netherland", "America");
		List<String> countriesWithN = country.stream().filter(str -> str.startsWith("N")).collect(Collectors.toList());
		System.out.println(countriesWithN);
		/* 
		 * 
		 *  
		String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";  
		 */
		
		
		String str = "Hello+-^Java+ -Programm43er^ ^^-- ^^^ +!";  
		/*   
		output: Hello Java   Programmer    !*/
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9!]"," "));
		System.out.println(str.replaceAll("[^\\w!]", " "));

		
		

	}
}
