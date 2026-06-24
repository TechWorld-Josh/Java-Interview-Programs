package org.techworldwithjosh._1.programs.string;

//String inputString = "Rotator";
//String str = "madam";
//int num = 121;

import java.util.stream.Collectors;

public class PalindromeProgram {
    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static boolean isPalindromeTraditional(String str) {

        int left = 0; // Start pointer
        int right = str.length() - 1; // End pointer

        while (left < right) { // Continue until pointers meet
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++; // Move left pointer forward
            right--; // Move right pointer backward
        }
        return true; // String is palindrome
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static boolean isPalindromeModern(String str) {

        String reversed = str.chars() // Convert String to IntStream
                .mapToObj(ch -> String.valueOf((char) ch)) // Convert char to String
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list); // Reverse list
                            return String.join("", list); // Join characters
                        }));

        return str.equals(reversed); // Compare original and reversed
    }

    public static void main(String[] args) {

        String str = "madam";

        // Part 1
        boolean traditionalResult = isPalindromeTraditional(str);
        // Part 2
        boolean modernResult = isPalindromeModern(str);

        System.out.println("Input String : " + str);
        System.out.println("\nTraditional Approach : " + (traditionalResult ? "Palindrome" : "Not Palindrome"));
        System.out.println("\nJava 8 / 17 / 21 Approach : " + (modernResult ? "Palindrome" : "Not Palindrome"));
    }
}