package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 3, 5, 7, 3, 4, 5};
        //add-in set
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(inputArray));
        //for each to print
        for (Integer integer : hashSet) {
            System.out.print(integer + " ");
        }

        // Remove duplicates using Stream distinct()
        List<Integer> uniqueNumbers = Arrays.stream(inputArray)
                .distinct()
                .toList();

        // Print the result
        System.out.println("Unique elements: " + uniqueNumbers);

        // Find duplicates using Java 8 Streams
        List<Integer> duplicates = Arrays.stream(inputArray)
                .collect(Collectors.groupingBy(num -> num, Collectors.counting())) // Count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter duplicates
                .map(Map.Entry::getKey)
                .toList();

        // Print duplicate elements
        System.out.println("Duplicate elements: " + duplicates);
    }
}
