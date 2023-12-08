package com.demo.test;
import java.util.Arrays;

public class RearrangeArray {
	public static void main(String[] args) {

		int[] arr = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1 && arr[i] != i) {
				int temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
