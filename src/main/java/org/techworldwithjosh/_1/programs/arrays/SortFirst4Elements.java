package org.techworldwithjosh._1.programs.arrays;

//Sorting first 4 element
//Arrays.sort(inputArray, 0, 4);
//System.out.println((Arrays.toString(inputArray)));

import java.util.Arrays;

public class SortFirst4Elements {

    public static void main(String[] args) {

        Integer[] inputArray = {9, 3, 7, 1, 8, 5, 2};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        Integer[] traditionalArray = inputArray.clone(); // Create copy

        int limit = 4; // Sort first 4 elements

        for (int i = 0; i < limit - 1; i++) { // Outer loop
            for (int j = i + 1; j < limit; j++) { // Inner loop

                if (traditionalArray[i] > traditionalArray[j]) {

                    int temp = traditionalArray[i]; // Swap elements
                    traditionalArray[i] = traditionalArray[j];
                    traditionalArray[j] = temp;
                }
            }
        }

        System.out.println("Traditional Approach:");
        System.out.println(Arrays.toString(traditionalArray));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        Integer[] modernArray = inputArray.clone(); // Create copy

        Integer[] firstFourSorted = Arrays.stream(modernArray) // Convert array to Stream
                .limit(4) // Take first 4 elements
                .sorted() // Sort them
                .toArray(Integer[]::new); // Convert back to array

        // Source array
        // Source start index
        // Destination array
        // Destination start index
        // Number of elements to copy
        System.arraycopy(firstFourSorted, 0, modernArray, 0, 4);

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(Arrays.toString(modernArray));
    }
}