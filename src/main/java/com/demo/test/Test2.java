package com.demo.test;

/*Write a program to add two large numbers without using any advanced APIs
like BigInteger, BigLong, etc.

String add(String a, String b)
//Input numbers can be very large, with 100 digits or more.
*/
public class Test2 {
	public static void main(String[] args) {

		System.out.println(add("1,111", "1,000"));
	}

	private static String formatNumber(String a) {
		return a.replaceAll("[,]", "");
	}

	static String add(String a, String b) {
		StringBuilder str = new StringBuilder();
		a = formatNumber(a);
		b = formatNumber(b);
		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}

		int m = a.length();
		int n = b.length();
		int k = m > n ? m : n;
		int start = n - 1;
		int carry = 0;

		for (int i = k - 1; i >= 0; i--) {
			if (start >= 0) {
				int sum = ((int) a.charAt(i) - '0') + ((int) b.charAt(start) - '0') + carry;
				int result = sum % 10;
				carry = sum / 10;
				str.append(result);
				System.out.println(((int) a.charAt(i) - '0') + "  " + ((int) b.charAt(start) - '0') + "  " + sum);
				start--;
			} else {
				int sum = ((int) a.charAt(i) - '0') + carry;
				int result = sum % 10;
				carry = sum / 10;
				str.append(result);
			}

			if (i == 0 && carry != 0) {
				str.append(carry);
			}

		}

		return str.reverse().toString();
	}

}
