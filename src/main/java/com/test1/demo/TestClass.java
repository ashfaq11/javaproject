package com.test1.demo;

//subsequence of larger string 
public class TestClass {
	public static void main(String[] args) {

		String s1 = "ttashfaq";
		StringBuilder max = new StringBuilder();

		for (int i = 0; i < s1.length(); i++) {
			int pointer = i;
			StringBuilder str = new StringBuilder();
			str.append(s1.charAt(pointer));
			while (pointer < s1.length() - 1) {
				if (s1.charAt(pointer) == s1.charAt(pointer + 1)) {
					str.append(s1.charAt(pointer + 1));
					pointer++;
				} else {
					break;
				}
			}
			if (str.length() > max.length())
				max = str;

		}

		System.out.println(max);
	}
}
