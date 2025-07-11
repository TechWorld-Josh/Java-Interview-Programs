package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeparateZeros {
    public static void main(String[] args) {
        Integer[] inputArray = {5, 0, 3, 0, 4, 6, 0, 7, 8, 0, 9};

        // Separate zeros from non-zeros using Java 8 Streams
        List<Integer> nonZeroElements = new java.util.ArrayList<>(Arrays.stream(inputArray)
                .filter(num -> num != 0)  // Keep non-zero elements
                .toList());

        List<Integer> zeroElements = Arrays.stream(inputArray)
                .filter(num -> num == 0)   // Keep zero elements
                .toList();

        // Combine non-zero elements followed by zeros
        nonZeroElements.addAll(zeroElements);

        System.out.println("Separated Array: " + nonZeroElements);
    }
}
