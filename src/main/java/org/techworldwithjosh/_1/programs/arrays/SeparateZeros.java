package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SeparateZeros {

    public static void main(String[] args) {

        int[] inputArray = {1, 0, 2, 0, 3, 0, 4, 5};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int[] traditionalArray = inputArray.clone(); // Create copy

        int index = 0; // Position for non-zero elements

        for (int num : traditionalArray) { // Traverse array
            if (num != 0) { // Non-zero element found
                traditionalArray[index++] = num; // Place non-zero element
            }
        }

        while (index < traditionalArray.length) { // Fill remaining positions
            traditionalArray[index++] = 0; // Place zeros at end
        }

        System.out.println("Traditional Approach:");
        System.out.println(Arrays.toString(traditionalArray));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int[] modernArray = IntStream.concat(
                        Arrays.stream(inputArray).filter(num -> num != 0), // Keep non-zero elements
                        Arrays.stream(inputArray).filter(num -> num == 0)  // Keep zero elements
                )
                .toArray(); // Convert stream back to array

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(Arrays.toString(modernArray));
    }
}