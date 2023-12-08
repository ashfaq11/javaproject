package com.demo.test;
import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] array,int low,int high) {
		
		if(low<high) { 
			
			int partitionIndex = partition(array,low,high);
			quickSort(array,low,partitionIndex-1);
			quickSort(array,partitionIndex+1,high);
			
		}
		
	}

	private static int partition(int[] array, int low, int high) {
		// TODO Auto-generated method stub
		int pivot= array[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if (array[j] < pivot) {
				i++;
				swap(array,i,j);
			}
		}
		
		swap(array,i+1,high);
		return i+1;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args) {
		int[]  array= new int[] {3232,3232,443,443,5,4,2332,43423,43423};
		quickSort(array, 0, array.length-1);
		Arrays.stream(array).forEach(System.out::println);
	}
	
}
