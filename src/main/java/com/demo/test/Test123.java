package com.demo.test;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test123 {

	public static void main(String[] args) {
		long number = 1333213111;
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		while (number > 0) {
			Integer rem = (int) (number % 10);
			number = number / 10;
			hm.put(rem, hm.get(rem) != null ? hm.get(rem) + 1 : 1);

		}

		int max = 0;
		int maxKey = 0;
		for (Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxKey = entry.getKey();
			}

		}
		 
		
		System.out.println(maxKey +" Count --> "+ max);
		
		System.out.println(hm.entrySet().stream()
				.sorted(Comparator.comparingInt(x -> ((Entry<Integer, Integer>) x).getValue()).reversed()).findFirst().get());

	}

}
