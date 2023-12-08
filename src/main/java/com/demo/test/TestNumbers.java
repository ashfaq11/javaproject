package com.demo.test;

public class TestNumbers {
	public static void main(String[] args) {
		String s1 = "99999234";
		String s2 = "923";
		int maxLength = s1.length() >= s2.length() ? s1.length() : s2.length();
		String num1 = String.format("%"+maxLength+"s", s1).replace(" ", "0");
		String num2 = String.format("%"+maxLength+"s", s2).replace(" ", "0");;
		
		System.out.println(num1);
		System.out.println(num2);
		int carry = 0;
		StringBuilder result = new StringBuilder();
		for (int i = maxLength - 1; i >= 0; i--) {
			int a = num1.charAt(i) - '0';
			int b = num2.charAt(i) - '0';
			int sum = a + b + carry;
			result.insert(0, sum % 10);
			carry = sum/10;
			 
		}
		if (carry != 0)
			result.insert(0, carry);

		System.out.println(result);

		for (int i = result.length() - 3; i > 0; i = i - 3) {
			result.insert(i, ",");
		}
		System.out.println(result);

	}
}
