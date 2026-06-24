package org.techworldwithjosh._1.programs.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordOrder {

    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static String reverseWordsTraditional(String str) {

        String[] words = str.split(" "); // Split words

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) { // Traverse backwards
            result.append(words[i]);

            if (i > 0) {
                result.append(" "); // Add space
            }
        }
        return result.toString();
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static String reverseWordsModern(String str) {

        List<String> words = Arrays.stream(str.split(" ")) // Convert to Stream
                .collect(Collectors.toList());

        Collections.reverse(words); // Reverse list

        return String.join(" ", words); // Join words
    }

    public static void main(String[] args) {

        String str = "Times Of India";

        System.out.println("Traditional : " + reverseWordsTraditional(str));

        System.out.println("Java 8/17/21 : " + reverseWordsModern(str));
    }
}