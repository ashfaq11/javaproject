package com.demo.test;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test0312 {
	public static void main(String[] args) {

		String str = "dadbcsdabcd";
		str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().forEach(System.out::println);

		StringBuilder sb = new StringBuilder();
		str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet()).stream().map(ch -> sb.append(ch)).count();

		System.out.println(sb);
	}
}
