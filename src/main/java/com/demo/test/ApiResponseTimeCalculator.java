package com.demo.test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ApiResponseTimeCalculator {

	public static void main(String[] args) {
		// Given data in the format: Caller service name, API being called, response
		// time
		String[] data = { "Service1 - API1 - 10", "Service2 - API1 - 8", "Service3 - API2 - 8", "Service2 - API2 - 12",
				"Service2 - API3 - 5" };

		System.out.println(Arrays.stream(data).map(parts -> parts.split(" - ")).filter(parts -> parts.length == 3)
				.collect(Collectors.groupingBy(parts -> parts[1],
						Collectors.averagingInt(parts -> Integer.parseInt(parts[2])))));

		Map<String, Map<String, Double>> serviceApiAvgTimeMap = Arrays.stream(data).map(entry -> entry.split(" - ")) 
				.filter(parts -> parts.length == 3) // Filter entries with exactly three parts
				.collect(Collectors.groupingBy(parts -> parts[0], // Group by service name (first part of the array)
						Collectors.groupingBy(parts -> parts[1], // Group by API (second part of the array)
								Collectors.averagingInt(parts -> Integer.parseInt(parts[2])) // Calculate average
																								// response time
						)));

		String[][] data2 = { { "Service1", "API1", "10" }, { "Service2", "API1", "13" }, { "Service3", "API3", "8" },
				{ "Service2", "API1", "10" }, { "Service3", "API2", "10" } };

		System.out.println(Arrays.stream(data2).filter(part -> part.length == 3).collect(
				Collectors.groupingBy(part -> part[1], Collectors.averagingLong(part -> Integer.parseInt(part[2])))));

		System.out.println(isValid("([])[{}]"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {

//			switch (ch) {
//
//			case '{', '[', '(' -> {
//				stack.push(ch);
//			}
//
//			case '}' -> {
//				if (stack.isEmpty() || stack.peek() != '{') {
//
//					return false;
//				}
//				stack.pop();
//			}
//
//			case ']' -> {
//				if (stack.isEmpty() || stack.peek() != '[') {
//					return false;
//				}
//				stack.pop();
//			}
//
//			case ')' -> {
//				if (stack.isEmpty() || stack.peek() != '(') {
//					return false;
//				}
//				stack.pop();
//
//			}
//			default -> {
//				return false;
//			}
//			}

		}
		return stack.isEmpty();

	}
}
