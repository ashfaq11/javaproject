package com.demo.test;

//  recursive;
//print 100;
// 0,1,1,2,3,5,8,13...
public class Fibonacci {

	public static void printFib(int n, int prev1,int prev2){
		int current = prev1 + prev2;
		if(prev1 == 0) {
			System.out.println(0);
			System.out.println(1);
		}

		if(current < n) {
			System.out.println(current);
			prev1 =prev2;
			prev2 = current;
			printFib(n-1,prev1,prev2);
		} 
	}
	  
	
	public static void main(String[] args) {
		 printFib(200,0,1);
	}
}
