package org.techworldwithjosh._1.programs.string;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LongestUniqueSubstring {

    public static void main(String[] args) {

        String str = "abcabcbb";

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        String longestSubstring = findLongestUniqueSubstring(str);

        System.out.println("Traditional Approach:");
        System.out.println("Longest Unique Substring = " + longestSubstring);

        System.out.println("Length = " + longestSubstring.length());

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        String modernSubstring = findLongestUniqueSubstringJava8(str);

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Longest Unique Substring = " + modernSubstring);

        System.out.println("Length = " + modernSubstring.length());
    }

    public static String findLongestUniqueSubstring(String str) {

        Set<Character> set = new HashSet<>();      // Store unique chars

        int left = 0;                              // Window start
        int maxLength = 0;                         // Longest length
        int startIndex = 0;                        // Longest substring start

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) { // Duplicate found
                set.remove(str.charAt(left));      // Shrink window
                left++;
            }
            set.add(str.charAt(right));            // Add current char

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        return str.substring(startIndex, startIndex + maxLength);
    }

    public static String findLongestUniqueSubstringJava8(String str) {

        return IntStream.range(0, str.length()).mapToObj(start -> {

                    Set<Character> set = new HashSet<>();

                    StringBuilder builder = new StringBuilder();

                    for (int end = start; end < str.length(); end++) {
                        char ch = str.charAt(end);
                        if (set.contains(ch)) {
                            break;
                        }
                        set.add(ch);
                        builder.append(ch);
                    }
                    return builder.toString();
                })
                .max(java.util.Comparator.comparingInt(String::length)).orElse("");
    }
}
