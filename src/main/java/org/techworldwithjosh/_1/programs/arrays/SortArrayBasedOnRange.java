package org.techworldwithjosh._1.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayBasedOnRange {

    public static void main(String[] args) {

        int[] inputArray = {12, 5, 8, 20, 15, 3, 10};

        int minRange = 5;
        int maxRange = 15;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int[] traditionalArray = inputArray.clone(); // Create copy

        List<Integer> rangeElements = new ArrayList<>(); // Store range values

        for (int num : traditionalArray) { // Traverse array
            if (num >= minRange && num <= maxRange) { // Check range
                rangeElements.add(num); // Collect range elements
            }
        }

        Collections.sort(rangeElements); // Sort collected values

        int index = 0; // Sorted list index

        for (int i = 0; i < traditionalArray.length; i++) {
            if (traditionalArray[i] >= minRange && traditionalArray[i] <= maxRange) {
                traditionalArray[i] = rangeElements.get(index++); // Replace
            }
        }

        System.out.println("Traditional Approach:");
        System.out.println(Arrays.toString(traditionalArray));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int[] modernArray = inputArray.clone(); // Create copy

        List<Integer> sortedRangeElements = Arrays.stream(modernArray) // Convert array to IntStream
                .filter(num -> num >= minRange && num <= maxRange) // Keep range values
                .sorted() // Sort them
                .boxed() // Convert int to Integer
                .toList(); // Collect to List

        int[] currentIndex = {0}; // Mutable index

        for (int i = 0; i < modernArray.length; i++) {
            if (modernArray[i] >= minRange && modernArray[i] <= maxRange) {
                modernArray[i] = sortedRangeElements.get(currentIndex[0]++);
            }
        }

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(Arrays.toString(modernArray));
    }
}
