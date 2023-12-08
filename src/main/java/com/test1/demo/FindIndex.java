package com.test1.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindIndex {

	public static void main(String[] args) {
		
		int number = 29345;
		
		int findIndex = 433244235;
		
		System.out.println(FindIndexes(number, findIndex));
	}
	private static int[] convertNumberToArray(int number) {
        // Convert the number to a string
        String numberAsString = Integer.toString(number);

        // Create an array to store individual digits
        int[] resultArray = new int[numberAsString.length()];

        // Convert each character back to an integer
        for (int i = 0; i < numberAsString.length(); i++) {
            resultArray[i] = Character.getNumericValue(numberAsString.charAt(i));
        }

        return resultArray;
    }
	
	static Object FindIndexes(int number, int FindIndexes) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		int[] numberArray=convertNumberToArray(number);
		int[] FindIndexesArray=convertNumberToArray(FindIndexes);
		for(int i=0;i<numberArray.length;i++) {
			List<Integer> list = new ArrayList<>();
			for(int j=0;j<FindIndexesArray.length;j++) {
				if(numberArray[i] == FindIndexesArray[j]) {
					list.add(j);
				}
			}
			map.put(numberArray[i],list);
		}
		return map;
	}
}
