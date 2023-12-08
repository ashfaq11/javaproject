package com.test1.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatativeChars {

	public static void main(String[] args) {
		String str = "Java is programming language";
		
		
		Map<Character, Long> charFrequencies = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1L, // Initial count is 1
                        Long::sum,
                        LinkedHashMap::new // LinkedHashMap supplier to maintain order
                ));        System.out.println(charFrequencies);
	}
	
}
