package org.techworldwithjosh._1.programs.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseSentenceWordByWord {

    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static String reverseEachWordTraditional(String str) {

        String[] words = str.split(" "); // Split sentence

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) { // Reverse word
                reversedWord.append(word.charAt(i));
            }
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static String reverseEachWordModern(String str) {

        return Arrays.stream(str.split(" "))              // Stream words
                .map(word ->
                        new StringBuilder(word)
                                .reverse()
                                .toString())             // Reverse each word
                .collect(Collectors.joining(" "));       // Join words
    }

    public static void main(String[] args) {

        String str = "Times Of India";

        System.out.println("Traditional : " + reverseEachWordTraditional(str));

        System.out.println("Java 8/17/21 : " + reverseEachWordModern(str));
    }
}
