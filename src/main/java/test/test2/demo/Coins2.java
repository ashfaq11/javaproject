package test.test2.demo;

/*Input: sum = 4, coins[] = {1,2,3}, 
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.*/

public class Coins2 {
	public static void main(String args[]) {
		int coins[] = { 1, 2, 3 };
		int n = coins.length;
		System.out.println(count(coins, n, 5));
	}

	private static int count(int[] coins, int n, int sum) {
		
		if (sum == 0)
			return 1;

		if (sum < 0 || n <= 0) {
			return 0;
		}

		return count(coins, n - 1, sum) + count(coins, n, sum - coins[n - 1]);
	}
}
