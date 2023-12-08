package com.demo.test;

public class SampleTest {

	public static void main(String[] args) {

		String str = "aba";
		
//		char[] strArray = str.toCharArray();
//		StringBuilder reverse=new StringBuilder();
//		for(char ch: strArray) {
//			reverse.append(ch);
//		}
//		
//		System.out.println(str.equals(reverse.toString()));
//		
//		
		
		int n = str.length() - 1;
		for (int i = n; i >= n/2; i--) {
			if (str.charAt(i) != str.charAt(n - i)) {
				System.out.println("not pallindrome");
				return;
			}
		}
		System.out.println("pallindrone");
		
	}
	
}
