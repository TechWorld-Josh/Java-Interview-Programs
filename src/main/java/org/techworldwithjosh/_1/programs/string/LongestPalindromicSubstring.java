package org.techworldwithjosh._1.programs.string;

import java.util.stream.IntStream;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "babad";

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        String longestPalindrome = findLongestPalindrome(str);

        System.out.println("Traditional Approach:");
        System.out.println("Longest Palindrome = " + longestPalindrome);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        String modernPalindrome = findLongestPalindromeJava8(str);

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Longest Palindrome = " + modernPalindrome);
    }

    public static String findLongestPalindrome(String str) {

        if (str == null || str.length() < 2) { // Single char is palindrome
            return str;
        }

        int start = 0;                          // Start index of result
        int maxLength = 1;                      // Length of result

        for (int i = 0; i < str.length(); i++) {
            int left = i;                       // Odd length palindrome
            int right = i;

            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }

            left = i;                           // Even length palindrome
            right = i + 1;

            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return str.substring(start, start + maxLength);
    }

    public static String findLongestPalindromeJava8(String str) {

        return IntStream.range(0, str.length()).mapToObj(i -> {

                    String odd = expand(str, i, i);       // Odd length
                    String even = expand(str, i, i + 1); // Even length

                    return odd.length() > even.length() ? odd : even;
                })
                .max(java.util.Comparator.comparingInt(String::length))
                .orElse("");
    }

    public static String expand(String str, int left, int right) {

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
}
