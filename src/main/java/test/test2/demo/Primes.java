package test.test2.demo;
import java.util.Arrays;

public class Primes {
	
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}
	    public static int countPrimes(int n) {
	        if(n==0||n==1 ) return 0;
	        
	        int[] array= new int[n];
	        for(int i=2;i<n;i++){
	             markArray(array, i);
	         }
	        Arrays.stream(array).forEach(System.out::print);
	        System.out.println();
	        int primes = (int) Arrays.stream(array).filter(x -> x!=1).count() - 2;
	        return primes;
	    }
	    private static void markArray(int[] array, int i) {
	    	for(int j= (i*2) ;j < array.length ; j+=i) {
	    			array[j]=1;
	    	}
		}
		 
	}
