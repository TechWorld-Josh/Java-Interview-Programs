package org.techworldwithjosh._1.programs.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {

    // =====================================
    // Part 1 : Traditional Approach (Recursion)
    // =====================================
    public static void generatePermutationsTraditional(String str, String permutation) {

        if (str.isEmpty()) {                         // Base condition
            System.out.println(permutation);         // Print permutation
            return;
        }

        for (int i = 0; i < str.length(); i++) {     // Iterate through characters
            char currentChar = str.charAt(i);        // Current character

            String remaining = str.substring(0, i) + str.substring(i + 1);            // Remove current character

            generatePermutationsTraditional(remaining, permutation + currentChar);      // Recursive call
        }
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static List<String> generatePermutationsModern(String str) {

        List<String> result = new ArrayList<>(); // Store all permutations

        generate(str, "", result); // Generate permutations

        return result;
    }

    private static void generate(String str, String permutation, List<String> result) {

        if (str.isEmpty()) { // Base condition
            result.add(permutation); // Add permutation to list
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // Current character
            String remaining = str.substring(0, i) + str.substring(i + 1); // Remaining string
            generate(remaining, permutation + currentChar, result); // Recursive call
        }
    }

    public static void main(String[] args) {

        String str = "ABC";

        System.out.println("Traditional Approach:");
        generatePermutationsTraditional(str, "");

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        generatePermutationsModern(str)                            // Convert List to Stream
                .forEach(System.out::println);       // Print permutations
    }
}

