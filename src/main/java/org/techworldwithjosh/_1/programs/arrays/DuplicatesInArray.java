package org.techworldwithjosh._1.programs.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static void findDuplicatesTraditional(int[] arr) {

        Set<Integer> uniqueElements = new HashSet<>(); // Stores unique elements
        Set<Integer> duplicateElements = new HashSet<>(); // Stores duplicates

        for (int num : arr) { // Traverse array
            if (!uniqueElements.add(num)) { // add() returns false if already present
                duplicateElements.add(num); // Duplicate found
            }
        }
        System.out.println("Traditional Approach:");
        duplicateElements.forEach(System.out::println);
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static void findDuplicatesModern(int[] arr) {

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        Arrays.stream(arr) // Convert array to IntStream
                .boxed() // Convert int to Integer
                .collect(Collectors.groupingBy(
                        Function.identity(), // Group by element itself
                        Collectors.counting())) // Count occurrences
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1) // Keep duplicates only
                .map(Map.Entry::getKey) // Extract duplicate number
                .forEach(System.out::println); // Print duplicates
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6, 1};

        // Part 1
        findDuplicatesTraditional(arr);
        // Part 2
        findDuplicatesModern(arr);
    }
}
