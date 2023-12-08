package com.demo.test;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3232 {

	public static void main(String[] args) {
		String str = "hi hi";

		System.out.println(str.chars().mapToObj(ch -> (char) ch).filter(ch -> Character.isAlphabetic(ch))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1));

		Map<Integer, String> hm = new HashMap();
		hm.put(3, "C");
		hm.put(23, "dd");
		hm.put(4, "d");
		hm.put(1, "a");
		hm = hm.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey))
				.collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new  ));
		System.out.println(hm);

		// collect(Collectors.toMap(LinkedHashMap::new, (map,entry), null))
		int[] array = new int[] { 4, 3, 2, 1, 3 };

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
	}

}
//
