package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;

public class SumOfArraysElement {

    public static void main(String[] args) {

        int[] inputArray = {10, 20, 30, 40, 50};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int traditionalSum = 0; // Store total sum

        for (int num : inputArray) { // Traverse array
            traditionalSum += num;                   // Add each element
        }

        System.out.println("Traditional Approach:");
        System.out.println("Sum = " + traditionalSum);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int modernSum = Arrays.stream(inputArray)            // Convert int[] to IntStream
                .sum();                      // Calculate sum

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Sum = " + modernSum);
    }
}
