package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementArray {
    public static void main(String[] args) {

        Integer[] inputArray1 = {1, 4, 7, 9};
        Integer[] inputArray2 = {1, 2};
        Integer[] inputArray3 = {1, 6};

        // Find common elements across multiple arrays using Streams
        Set<Integer> commonElements = Arrays.stream(inputArray1)
                .filter(num -> Arrays.asList(inputArray2).contains(num) && Arrays.asList(inputArray3).contains(num)) // Check if element is in all arrays
                .collect(Collectors.toSet()); // Collect to a Set to avoid duplicates

        System.out.println("Common Elements: " + commonElements);
    }
}
