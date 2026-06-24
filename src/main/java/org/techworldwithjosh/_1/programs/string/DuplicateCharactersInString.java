package org.techworldwithjosh._1.programs.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
    // ==================================
    // Traditional Approach
    // ==================================
    public static void findDuplicatesTraditional(String str) {

        // Store character frequencies
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Traditional Approach:");

        // Print only duplicate characters
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    // ==================================
    // Java 8 / 17 / 21 Stream Approach
    // ==================================
    public static void findDuplicatesStream(String str) {

        Map<Character, Long> frequencyMap =
                str.chars() // Convert String to IntStream
                        .mapToObj(ch -> (char) ch) // Convert int ASCII values to Character
                        .collect(Collectors.groupingBy(
                                Function.identity(), // Group by same character
                                LinkedHashMap::new, // Preserve insertion order
                                Collectors.counting())); // Count occurrences

        frequencyMap.entrySet()
                .stream() // Convert Map entries to Stream
                .filter(entry -> entry.getValue() > 1) // Keep only duplicate characters
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }

    public static void main(String[] args) {

        String input = "programming";

        findDuplicatesTraditional(input);

        findDuplicatesStream(input);
    }
}

