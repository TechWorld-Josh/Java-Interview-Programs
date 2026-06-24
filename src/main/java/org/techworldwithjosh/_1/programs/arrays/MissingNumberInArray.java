package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;

public class MissingNumberInArray {

    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static int findMissingTraditional(int[] arr) {

        int n = arr.length + 1; // Total numbers including missing one
        int expectedSum = n * (n + 1) / 2; // Sum of 1 to n
        int actualSum = 0; // Sum of array elements

        for (int num : arr) { // Traverse array
            actualSum += num; // Add each element
        }

        return expectedSum - actualSum; // Missing number
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static int findMissingModern(int[] arr) {

        int n = arr.length + 1; // Total count including missing number
        int expectedSum = n * (n + 1) / 2; // Expected sum

        int actualSum = Arrays.stream(arr) // Convert array to IntStream
                .sum(); // Calculate sum
        return expectedSum - actualSum; // Missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        // Part 1
        int traditionalResult = findMissingTraditional(arr);
        // Part 2
        int modernResult = findMissingModern(arr);

        System.out.println("Traditional Approach : " + traditionalResult);
        System.out.println("Java 8 / 17 / 21 Approach : " + modernResult);
    }
}
