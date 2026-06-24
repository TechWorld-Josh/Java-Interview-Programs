package org.techworldwithjosh._3.dsa;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LinearSearch {

    public static void main(String[] args) {

        int[] inputArray = {10, 20, 30, 40, 50};

        int target = 30;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int foundIndex = -1;                          // Default if not found

        for (int i = 0; i < inputArray.length; i++) { // Traverse array
            if (inputArray[i] == target) {            // Check target
                foundIndex = i;                       // Store index
                break;                                // Stop searching
            }
        }
        System.out.println("Traditional Approach:");

        if (foundIndex != -1) {
            System.out.println("Element Found at Index = " + foundIndex);
        } else {
            System.out.println("Element Not Found");
        }

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int modernIndex = IntStream.range(0, inputArray.length) // Generate indices
                .filter(i -> inputArray[i] == target) // Match target
                .findFirst()                  // First matching index
                .orElse(-1);                 // Return -1 if not found

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        if (modernIndex != -1) {
            System.out.println("Element Found at Index = " + modernIndex);
        } else {
            System.out.println("Element Not Found");
        }
    }
}