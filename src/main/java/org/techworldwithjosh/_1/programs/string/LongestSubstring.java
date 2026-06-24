package org.techworldwithjosh._1.programs.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static void longestSubstringTraditional(String str) {

        Set<Character> set = new HashSet<>();      // Store unique characters

        int left = 0;                              // Window start
        int maxLength = 0;                         // Maximum length found

        String longestSubstring = "";

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);  // Current character

            while (set.contains(currentChar)) {    // Duplicate found
                set.remove(str.charAt(left));      // Remove left character
                left++;                            // Shrink window
            }

            set.add(currentChar);                  // Add current character

            int currentLength = right - left + 1; // Current window size

            if (currentLength > maxLength) {
                maxLength = currentLength;         // Update max length
                longestSubstring = str.substring(left, right + 1);
            }
        }

        System.out.println("Traditional Approach:");
        System.out.println("Longest Substring = " + longestSubstring);
        System.out.println("Length = " + maxLength);
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static void longestSubstringModern(String str) {

        Map<Character, Integer> map = new HashMap<>(); // Character -> Last Index

        int left = 0;                                  // Window start
        int maxLength = 0;                             // Maximum length
        int startIndex = 0;                            // Start index of answer

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);      // Current character

            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);     // Jump left pointer
            }

            map.put(currentChar, right);               // Update latest index

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Longest Substring = " + str.substring(startIndex, startIndex + maxLength));
        System.out.println("Length = " + maxLength);
    }

    public static void main(String[] args) {

        String str = "abcabcbb";

        // Part 1
        longestSubstringTraditional(str);
        // Part 2
        longestSubstringModern(str);
    }
}
