package com.demo.test;

//testcase
//
//two string .. output sum of this two inputs numeric and positive
public class Test2711 {

	

	static String add(String a, String b) {

		StringBuilder result = new StringBuilder();
//		System.out.println(a);
//		System.out.println(b);
		a = a.replace(",", "");
		b = b.replace(",", "");
		int length = a.length() >= b.length() ? a.length() : b.length();
		String str1 = String.format("%" + length + "s", a).replace(" ", "0");
		String str2 = String.format("%" + length + "s", b).replace(" ", "0");

//		System.out.println("----------------");

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
		// add comma 3
		
		for (int i = result.length() - 3; i > 0; i = i - 3) {
			result.insert(i, ",");
		}
		
		
		return result.toString();
	}

//	static int[] fib = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
	public static String getFibNumber(int number) {
//		if (number <= 0 && number > fib.length) {
//			System.out.println("invalid index");
//			return -1;
//		} 
		
		String f1 ="0",  f2="1";
		if(number ==0)
			return f1;
		if(number==1)
			return f2;
		String f3="0";
		int index =0;
		while(index < number-1) {
			f3 = add(String.valueOf(f1),String.valueOf(f2));
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
			index++;
		}
		return f3;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getFibNumber(10));
		
//		System.out.println(add("1,234,233", "1,234,555"));
	}
}
