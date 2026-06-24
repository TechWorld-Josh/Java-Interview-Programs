package org.techworldwithjosh._3.dsa;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] inputArray = {64, 25, 12, 22, 11};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int[] traditionalArray = inputArray.clone();     // Create copy

        for (int i = 0; i < traditionalArray.length - 1; i++) { // Current position

            int minIndex = i;                            // Assume current is minimum

            for (int j = i + 1; j < traditionalArray.length; j++) { // Find minimum
                if (traditionalArray[j] < traditionalArray[minIndex]) {
                    minIndex = j;                        // Update minimum index
                }
            }

            int temp = traditionalArray[i];             // Store current element
            traditionalArray[i] = traditionalArray[minIndex]; // Put minimum at correct position
            traditionalArray[minIndex] = temp;          // Complete swap
        }

        System.out.println("Traditional Approach:");
        System.out.println(Arrays.toString(traditionalArray));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int[] modernArray = Arrays.stream(inputArray)               // Convert array to stream
                .sorted()                       // Sort elements
                .toArray();                     // Convert back to array

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(Arrays.toString(modernArray));
    }
}
