package com.demo.test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Random {
	public static void main(String[] args) {

		IntStream randomNumbers = new java.util.Random().ints(100, 0, 100);

		// Print the random numbers

		Object[] obj = new Object[] { 1, new Object[] { 2, 3 }, new Object[] { 4, 5 } };

		// Using flatMap to flatten the array into a Stream of integers
		Stream<Object> flattenedStream = Arrays.stream(obj).flatMap(
				element -> element instanceof Object[] ? Arrays.stream((Object[]) element) : Stream.of(element));

		// Print the result
		flattenedStream.forEach(System.out::println);

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		// Using flatMap to flatten the list of lists into a single list
		List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());

		// Print the result
		System.out.print(flattenedList);

		printFlatarray(obj);
	}

	private static void printFlatarray(Object[] obj) {
		for (int i = 0; i < obj.length; i++) {

			if (obj[i] instanceof Integer) {
				System.out.println(obj[i]);
			} else {
				printFlatarray((Object[]) obj[i]);
			}
		}
	}
}
