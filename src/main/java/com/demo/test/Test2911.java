package com.demo.test;

public class Test2911 {
	//target inside array if not -1;
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,3,4,5,6};
		
		System.out.println(getIndex(arr,1));
	}
	public static int getIndex(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
	    int low=0;
	    int high = arr.length;
	    
	    while(low<high) {
	    	int mid = (low+high)/2;
	    	if(arr[mid]==target)
	    		return mid;
	    	if(mid < target) {
	    		low = mid+1;
	    	}else {
	    		high= mid-1;
	    	}
	    }
		
		
		return -1;
	}
	//fault 
	//10 req/sec -> 3rd party 5 req/sec
	// upgrade
	

}
