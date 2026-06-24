package org.techworldwithjosh._1.programs.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    // ==============================
    // Approach 1: Traditional Java
    // ==============================
    public static Character firstNonRepeatedTraditional(String str) {

        // Handle null or empty string
        if (str == null || str.isEmpty()) {
            return null;
        }

        // LinkedHashMap preserves insertion order
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : str.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                return ch;
            }
        }

        // No non-repeated character found
        return null;
    }

    // ===================================
    // Approach 2: Java 8/17/21 Streams
    // ===================================
    public static Character firstNonRepeatedStream(String str) {

        return str.chars()                           // Convert String to IntStream
                .mapToObj(ch -> (char) ch)           // Convert int to Character
                .collect(Collectors.groupingBy(
                        Function.identity(),         // Group by character
                        LinkedHashMap::new,          // Preserve insertion order
                        Collectors.counting()))      // Count occurrences
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Keep frequency = 1
                .map(Map.Entry::getKey)                 // Extract character
                .findFirst()                            // First unique character
                .orElse(null);                          // Return null if not found
    }

    public static void main(String[] args) {

//        String input = "swiss";
        String input = "aabbcddeefhhh";

        // Traditional Approach
        Character traditionalResult = firstNonRepeatedTraditional(input);

        // Stream Approach
        Character streamResult = firstNonRepeatedStream(input);

        System.out.println("Input String : " + input);
        System.out.println("Traditional Approach Result : " + traditionalResult);

        System.out.println("Java 8/17/21 Stream Result : " + streamResult);
    }
}
