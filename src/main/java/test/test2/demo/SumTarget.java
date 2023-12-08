package test.test2.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
public class SumTarget {

	public static void main(String[] args) {
		int[] array = new int[] { 3, 4, 5, 0 };

		int[] result = findIndexofSum(array, 3);
		Arrays.stream(result).forEach(x -> System.out.print(x + " "));
	}

	public static int[] findIndexofSum(int[] array, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			int find = target - array[i];
			if (map.containsKey(find)) {
				//System.out.println(map.get(find)+ " "+ i);
				return new int[] { map.get(find), i };
			}
			map.put(array[i],i);
		}

		return new int[] { -1, -1 };
	}
}
