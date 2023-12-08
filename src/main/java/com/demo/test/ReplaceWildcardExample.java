package com.demo.test;
public class ReplaceWildcardExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String inputString = "???????????????????????????????????????????????????????????????????????b";
        String resultString = replaceWildcard(inputString);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("Original string: " + inputString);
        System.out.println("Result string:   " + resultString);
        System.out.println("Execution time:  " + executionTime + " ms");
    }

    private static String replaceWildcard(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '?') {
                char replacement = getReplacement(result, i < input.length() - 1 ? input.charAt(i + 1) : '\0');
                result.append(replacement);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private static char getReplacement(StringBuilder result, char nextChar) {
        int len = result.length();

        if (len >= 2 && result.charAt(len - 1) == 'a' && result.charAt(len - 2) == 'a') {
            return 'b'; // Ensure nextChar is not 'b'
        }

        if (len >= 2 && result.charAt(len - 1) == 'b' && result.charAt(len - 2) == 'b') {
            return 'a'; // Ensure nextChar is not 'a'
        }

        return nextChar == 'a' ? 'b' : 'a';
    }
}
