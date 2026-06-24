package org.techworldwithjosh._1.programs.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurrence {
    // ==================================
    // Traditional Approach
    // ==================================
    public static void countOccurrenceTraditional(String str) {

        // LinkedHashMap preserves insertion order
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Traverse each character
        for (char ch : str.toCharArray()) {

            // Increase count if present
            // Otherwise insert with count 1
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Traditional Approach:");

        // Print character and count
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    // ==================================
    // Java 8 / 17 / 21 Stream Approach
    // ==================================
    public static void countOccurrenceStream(String str) {

        Map<Character, Long> frequencyMap =
                str.chars() // Convert String to IntStream
                        .mapToObj(ch -> (char) ch) // Convert int ASCII values to Character
                        .collect(Collectors.groupingBy(
                                Function.identity(), // Group by character
                                LinkedHashMap::new, // Preserve insertion order
                                Collectors.counting())); // Count occurrences

        System.out.println("\nStream Approach:");
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    public static void main(String[] args) {

        String input = "programming";

        countOccurrenceTraditional(input);

        countOccurrenceStream(input);
    }
}
