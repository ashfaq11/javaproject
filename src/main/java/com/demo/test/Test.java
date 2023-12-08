package com.demo.test;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

//program find highest number in list;
public class Test {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 555, 2332, 23321);
		int max = 0;
		for (int num : list) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);

		for (int i = 0; i < 10; i++) {
			System.out.println(new Random().nextInt());
		}

		
		
		String str = "Fox jumped over a pot find the first non-repeated character in it using Stream functions?";
		
		LinkedHashMap<Character, Integer> map = str.chars().mapToObj(ch -> (char) ch).collect(LinkedHashMap::new,
				(m, c) -> m.merge(c , 1, Integer::sum), LinkedHashMap::putAll);
		
		System.out.println(map);
		System.out.println(map.entrySet().stream().filter( entry -> entry.getValue()==1).findFirst().get());
		
		//Collectors.groupingBy(Function.identity(),Collectors.counting()))
		
		
	}
}