package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {

        Integer[] inputArray = {9, 1, 3, 5, 7};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int temp; // Temporary variable for swapping

        for (int i = 0; i < inputArray.length; i++) { // Outer loop
            for (int j = i + 1; j < inputArray.length; j++) { // Compare with remaining elements

                if (inputArray[i] < inputArray[j]) { // Descending order sorting
                    temp = inputArray[i]; // Store current value
                    inputArray[i] = inputArray[j]; // Swap values
                    inputArray[j] = temp; // Complete swap
                }
            }
        }

        System.out.println("Traditional Approach:");
        System.out.println("2nd Largest Element = " + inputArray[1]); // Second largest element

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int secondLargest = Arrays.stream(inputArray) // Convert array to Stream
                .distinct() // Remove duplicate elements
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1) // Skip largest element
                .findFirst() // Get second largest element
                .orElseThrow(() -> new RuntimeException("No second largest number found"));

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Second Largest Number = " + secondLargest);
    }
}
