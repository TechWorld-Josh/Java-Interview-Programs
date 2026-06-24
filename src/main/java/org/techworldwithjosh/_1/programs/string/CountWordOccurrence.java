package org.techworldwithjosh._1.programs.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurrence {

    public static void main(String[] args) {

        String str = "Java Developer Java Spring";

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        String[] words = str.split(" ");       // Split string into words

        Map<String, Integer> wordCountMap = new HashMap<>();               // Store word and count

        for (String word : words) {            // Traverse each word
            if (wordCountMap.containsKey(word)) { // Word already exists
                wordCountMap.put(word, wordCountMap.get(word) + 1); // Increment count
            } else {
                wordCountMap.put(word, 1);     // First occurrence
            }
        }

        System.out.println("Traditional Approach:");

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {

            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        Arrays.stream(str.split(" "))          // Convert words to Stream
                .collect(Collectors.groupingBy(
                        word -> word,          // Group by word
                        LinkedHashMap::new,    // Maintain insertion order
                        Collectors.counting()  // Count occurrences
                ))
                .forEach((word, count) -> System.out.println(word + "=" + count));
    }
}