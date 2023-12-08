package com.demo.test;


import java.util.Arrays;

public class StairClimbing {

	public static int climbStairs(int n) {
		if (n <= 1) {
			return 1;
		}

		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		Arrays.stream(dp).forEach(x -> System.out.println(x));
		return dp[n];
	}

	public static void main(String[] args) {
		int n = 5; // You can change this to the desired number of stairs
		int ways = climbStairs(n);
		System.out.println("Number of distinct ways to climb " + n + " stairs: " + ways);
	}
}
