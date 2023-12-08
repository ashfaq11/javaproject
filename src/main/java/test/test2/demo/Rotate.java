package test.test2.demo;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
	}

	private static void rotate(int[] nums, int k) {
		int n = nums.length;
		k %= n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k , n - 1);
		Arrays.stream(nums).forEach(x -> System.out.print(x + " "));
	}

	private static void reverse(int[] nums, int start, int end) {

		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
