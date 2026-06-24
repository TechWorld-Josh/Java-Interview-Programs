package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementArray {
    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static void findCommonTraditional(Integer[] arr1, Integer[] arr2, Integer[] arr3) {

        Set<Integer> set1 = new HashSet<>(); // Store elements of arr1
        Set<Integer> set2 = new HashSet<>(); // Store elements of arr2

        Collections.addAll(set1, arr1);
        Collections.addAll(set2, arr2);

        System.out.println("Traditional Approach:");
        for (Integer num : arr3) { // Traverse arr3
            if (set1.contains(num) && set2.contains(num)) { // Present in arr1 && // Present in arr2
                System.out.println(num);
            }
        }
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static void findCommonModern(Integer[] arr1, Integer[] arr2, Integer[] arr3) {

        Set<Integer> set2 = Arrays.stream(arr2).collect(Collectors.toSet()); // Convert arr2 to Set
        Set<Integer> set3 = Arrays.stream(arr3).collect(Collectors.toSet()); // Convert arr3 to Set

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        Arrays.stream(arr1) // Convert arr1 to Stream
                .filter(set2::contains) // Present in arr2
                .filter(set3::contains) // Present in arr3
                .distinct() // Remove duplicates
                .forEach(System.out::println); // Print common elements
    }

    public static void main(String[] args) {

        Integer[] inputArray1 = {1, 4, 7, 9};
        Integer[] inputArray2 = {1, 2};
        Integer[] inputArray3 = {1, 6};

        // Part 1
        findCommonTraditional(inputArray1, inputArray2, inputArray3);
        // Part 2
        findCommonModern(inputArray1, inputArray2, inputArray3);
    }
}
