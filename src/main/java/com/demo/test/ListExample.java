package com.demo.test;

/******************************************************************************
Welcome to GDB Online.
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
import java.util.*;

public class ListExample {
	public static void main(String[] args) throws Exception {
		int[] original = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int splitSize = 3;

		/*
		 * expected Output [0, 1, 2] [3, 4, 5] [6, 7, 8] [9]
		 */
		List<int[]> list = splitArray(original, splitSize);
		list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));

	}

	public static List<int[]> splitArray(int[] array, int splitSize) throws Exception {
		if (splitSize <= 0) {
			throw new Exception("Invalid size");
		}
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < array.length; i += splitSize) {
			if (array.length - i < splitSize) {
				int[] newArray = new int[array.length - i];
				System.arraycopy(array, i, newArray, 0, array.length - i);
				list.add(newArray);
			} else {
				int[] newArray = new int[splitSize];
				System.arraycopy(array, i, newArray, 0, splitSize);
				list.add(newArray);
			}

		}
		return list;

	}
}
