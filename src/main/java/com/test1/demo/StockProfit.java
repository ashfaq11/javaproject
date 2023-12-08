package com.test1.demo;

import java.util.Arrays;

public class StockProfit {
	public static void main(String[] args) {

		int[] prices  =  { 7,7,5,5,5,4 };
		int[] prices1 = { 7,7,5,5,5,4 };

//		System.out.println(maxProfit(prices));
	}

	public static int findOne(int[] prices) {
		int out = 0;
		for(int x : prices) {
			out ^= x;
		}
		
		return out;
	}
	public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                maxProfit += profit;
            }
        }

        return maxProfit;
	}
}