package org.techworldwithjosh._1.programs.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {
    // ==================================
    // Traditional Approach
    // ==================================
    public static void countFrequencyTraditional(String[] inputArray) {

        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String fruit : inputArray) {                       // Iterate through array
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);   // Increment count
        }

        System.out.println("Traditional Approach:");
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    // ==================================
    // Java 8 / 17 / 21 Stream Approach
    // ==================================
    public static void countFrequencyStream(String[] inputArray) {

        Map<String, Long> frequencyMap =
                Arrays.stream(inputArray)                       // Convert array to Stream
                        .collect(Collectors.groupingBy(
                                Function.identity(),            // Group by word itself
                                LinkedHashMap::new,            // Preserve insertion order
                                Collectors.counting()));       // Count occurrences

        System.out.println("\nStream Approach:");
        frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    public static void main(String[] args) {
        String[] inputArray = {
                "apple",
                "banana",
                "apple",
                "orange",
                "banana",
                "apple"
        };
        countFrequencyTraditional(inputArray);
        countFrequencyStream(inputArray);
    }
}
