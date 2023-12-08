package com.demo.test;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 1, 4, 6, 32, 12, 7 };
		Set<Integer> hashSet = new HashSet<Integer>();
		Arrays.stream(arr).forEach(x -> hashSet.add(x));
		int max = 1;
		for (int x : arr) {
			int big = 1;
			int num = x;
			
			if (hashSet.contains(num - 1)) {
				continue;
			}

			while (hashSet.contains(num + 1)) {
				num = num + 1;
				big++;
			}
			
			max = big > max ? big : max;
		}
		
		System.out.println(max);
	}
}
