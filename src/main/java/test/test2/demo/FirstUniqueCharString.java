package test.test2.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharString {
	public static void main(String[] args) {

		String str = "aaad";
		Map<Character, Integer> m = str.chars().mapToObj(ch -> (char) ch).filter(ch -> ch != ' ')
				.collect(LinkedHashMap::new, (map, ch) -> map.merge(ch, 1, Integer::sum), LinkedHashMap::putAll);

//		System.out.println(m.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().ifPresentOrElse(entry-> entry.getKey(), "-1"));
	}
}
