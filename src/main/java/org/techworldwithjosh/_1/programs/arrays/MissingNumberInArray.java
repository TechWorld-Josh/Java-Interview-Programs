package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Integer[] inputArray = {9, 3, 1, 5, 7, 8, 2};

        // Convert array to Set for quick lookup
        Set<Integer> numberSet = Arrays.stream(inputArray).collect(Collectors.toSet());

        // Find min and max in the array
        int min = Arrays.stream(inputArray).min(Integer::compareTo).orElseThrow();
        int max = Arrays.stream(inputArray).max(Integer::compareTo).orElseThrow();

        // Find missing numbers
        List<Integer> missingNumbers = IntStream.rangeClosed(min, max)
                .filter(num -> !numberSet.contains(num)) // Filter numbers not in array
                .boxed()
                .toList();

        // Print missing numbers
        System.out.println("Missing numbers: " + missingNumbers);

    }
}
