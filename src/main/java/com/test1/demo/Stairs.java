package com.test1.demo;

public class Stairs {
	public static int climbStairs(int n) {
        if(n<=2){
            return n;
        } 
        
         int[] result = new int[n];
         result[0] = 1;
         result[1] = 2;

        for(int i=2 ;i < n ;i++){
            result[i] = Math.addExact(result[i-1] , result[i-2]);
        }
        return result[n-1];
    }
	
	
	public static void main(String[] args) {
		System.out.println(climbStairs(4));;
	}
}
