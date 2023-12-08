package com.demo.test;

public class S1 {
	public static void main(String[] args) {
		String input = "India is a democratic Country";
		String searchStr = "iiitry";
		System.out.println(isSubsequence(input, searchStr));
	}

	private static boolean isSubsequence(String input, String searchStr) {
		int count = 0;
		for (int i = 0; i < input.length() && count<searchStr.length() ; i++) {
			if (searchStr.charAt(count) == input.charAt(i)) {
				count++;
			}
		}
		if (count == searchStr.length())
			return true;
		return false;

	}

}
