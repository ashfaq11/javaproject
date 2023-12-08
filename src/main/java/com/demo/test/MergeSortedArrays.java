package com.demo.test;


public class MergeSortedArrays {

	public static void mergeArrays(int[] arr1, int m, int[] arr2, int n) {
		int i = m - 1; // Index of last element in arr1
		int j = n - 1; // Index of last element in arr2
		int k = m + n - 1; // Index of last element in merged array (ARR1)

		System.out.println(m + "" + n + "" + k);
		// Merge arr1 and arr2 from the end
		while (i >= 0 && j >= 0) {
			if (arr1[i] > arr2[j]) {
				arr1[k--] = arr1[i--];
			} else {
				arr1[k--] = arr2[j--];
			}
		}

		// If there are remaining elements in arr2, copy them to arr1
		while (j >= 0) {
			arr1[k--] = arr2[j--];
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 6, 9, 0, 0 };
		int[] arr2 = { 4, 10 };
		int m = arr1.length - arr2.length; // Number of elements in arr1
		int n = arr2.length; // Number of elements in arr2

		// Merge arr2 into arr1
		mergeArrays(arr1, m, arr2, n);

		// Print the merged array (ARR1)
		System.out.print("Merged Array (ARR1): ");
		for (int value : arr1) {
			System.out.print(value + " ");
		}
	}
}
