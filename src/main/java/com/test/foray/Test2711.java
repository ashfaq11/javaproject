package com.test.foray;

//testcase
//
//two string .. output sum of this two inputs numeric and positive

public class Test2711 {

	public static void main(String[] args) {

		System.out.println(add("987", "423"));
	}

	public static String add(String a, String b) {

		StringBuilder result = new StringBuilder();
		int length = a.length() >= b.length() ? a.length() : b.length();
//		System.out.println(length);
		String str1 = String.format("%" + length + "s", a).replace(" ", "0");
		String str2 = String.format("%" + length + "s", b).replace(" ", "0");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println("----------------");

		int carry = 0;
		for (int i = length - 1; i >= 0; i--) {
			int n1 = str1.charAt(i) - '0';
			int n2 = str2.charAt(i) - '0';
			int sum = n1 + n2 + carry;
			result.insert(0, sum % 10);
			carry = sum / 10;

		}
		if (carry != 0) {
			result.insert(0, carry);
		}

		return result.toString();
	}


}
