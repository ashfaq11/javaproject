package com.test1.demo;

import java.util.Arrays;
import java.util.function.Function;

public class MaxSubArray {
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

	public static int maxSubArray(int[] nums) {
		int max = 0;

		int sum = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			sum += nums[i];

			if (sum > max) {
				max = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
}
