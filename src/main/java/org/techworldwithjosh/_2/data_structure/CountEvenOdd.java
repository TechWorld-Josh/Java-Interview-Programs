package org.techworldwithjosh._2.data_structure;

import java.util.Arrays;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] inputArray = {10, 15, 20, 25, 30, 35, 40};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int evenCount = 0;                           // Count even numbers
        int oddCount = 0;                            // Count odd numbers

        for (int num : inputArray) {                 // Traverse array
            if (num % 2 == 0) {                      // Check even number
                evenCount++;                         // Increment even count
            } else {
                oddCount++;                          // Increment odd count
            }
        }

        System.out.println("Traditional Approach:");
        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count  = " + oddCount);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        long evenNumbers = Arrays.stream(inputArray) // Convert array to IntStream
                .filter(num -> num % 2 == 0) // Keep even numbers
                .count(); // Count even numbers

        long oddNumbers = Arrays.stream(inputArray) // Convert array to IntStream
                .filter(num -> num % 2 != 0) // Keep odd numbers
                .count(); // Count odd numbers

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Even Count = " + evenNumbers);
        System.out.println("Odd Count  = " + oddNumbers);
    }
}
