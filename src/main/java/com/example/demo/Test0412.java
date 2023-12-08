package com.example.demo;

import java.util.Arrays;

/*
Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
*/
public class Test0412 {

	public static void main(String[] args) {
		int[] array   = new int[] { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
 
		int count0 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				count0++;
			 
		}
		System.out.println(count0+" ");

		for (int i = 0; i < count0; i++) {
			array[i] = 0;
		}
		System.out.println(Arrays.toString(array));

		for (int i = array.length-1; i >= array.length-count0; i--) {
			array[i] = 1;
		}

		System.out.println(Arrays.toString(array));
		System.out.println(test());
	}
	/*
	 * int i=0; int length = n; condition i!=length
	 * 
	 * 0, 1, 0, 1, 0, 0, 1, 1, 1, 0
	 */

	private static int test() {
		// TODO Auto-generated method stub
		try {
		    return 1;
		} catch (Exception e) {
		    return 2;
		} finally {
		    return 3;
		}
	}
	
}
