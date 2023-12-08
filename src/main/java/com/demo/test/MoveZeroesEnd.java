package com.demo.test;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MoveZeroesEnd {
public static void main(String[] args) {
	
	
	int[] a =  new int[]{1,2,0,0,3,0,43,3};
	System.out.println(Arrays.toString(a));

	int j=0;
	//move zeroes to right
	for(int i=0;i< a.length;i++) {
		if(a[i]!=0) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			j++;
		}
		
	}
	System.out.println(Arrays.toString(a));

	 a =  new int[]{1,2,0,0,3,0,43,3};
	//move zeroes to right
//	int count = 0;
//	int zeroCnt = 0;
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i] == 0)
//		{
//			zeroCnt++;
//			a[i] = a[zeroCnt-1];
//			a[zeroCnt-1]=0;
//		}
//	}
	 
	//left
	for (int i = a.length - 1; i >= 0; i--) {
		boolean nonzeroes = true;
		if (a[i] == 0) {
			for (j = i - 1; j >= 0; j--) {
				if (a[j] != 0) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					nonzeroes= false;
					break;
				}

			}
			if(nonzeroes) {
				break;
			}
			
			
		}
		
//		System.out.println(Arrays.toString(a));

		
	}
	
	System.out.println(Arrays.toString(a));
	
}
}
