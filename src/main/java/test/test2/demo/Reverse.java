package test.test2.demo;

import java.math.BigInteger;

public class Reverse {
public static void main(String[] args) {
	System.out.println(reverse(12));;
}
	public static long reverse(long number) {
		  // Check if the number is negative
        boolean isNegative = number < 0;

        // Convert the absolute value of the number to a string
        String numberStr = Long.toString(Math.abs(number));

        // Reverse the string
        String reversedStr = new StringBuilder(numberStr).reverse().toString();

        try {
            // Convert the reversed string back to a long and restore the sign
            long reversedNumber = Long.parseLong(reversedStr);
            return isNegative ? -reversedNumber : reversedNumber;
        } catch (NumberFormatException e) {
            // Handle the case where the reversed number exceeds the range of long
            System.err.println("Error: Reversed number exceeds the range of long.");
            return 0;
        }	}
}
