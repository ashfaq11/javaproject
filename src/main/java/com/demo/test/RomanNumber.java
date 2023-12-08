package com.demo.test;
import java.util.HashMap;

public class RomanNumber {
	
	public static void main(String[] args) {
		
		System.out.println(converter("XXII"));
		
	}

	private static int converter(String str) {
		int sum=0;
		HashMap<Character,Integer> hm= new HashMap<>();
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);

		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1 && (hm.get(str.charAt(i)) < hm.get(str.charAt(i + 1)))) {
				sum -= hm.get(str.charAt(i));
			} else {
				sum += hm.get(str.charAt(i));
			}
			System.out.println(sum +" " +str.charAt(i));
		}
		
		
		return sum;
	}
	
}
