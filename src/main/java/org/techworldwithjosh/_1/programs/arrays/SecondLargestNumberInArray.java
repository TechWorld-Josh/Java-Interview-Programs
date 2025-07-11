package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        Integer[] inputArray = {9, 1, 3, 5, 7};

        int temp;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {

                if (inputArray[i] < inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        System.out.println("2nd largest element : = " + inputArray[1]);

        int secondLargest = Arrays.stream(inputArray)
                .distinct() // Remove duplicates
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1) // Skip the first (largest) element
                .findFirst() // Get the second largest
                .orElseThrow(() -> new RuntimeException("No second largest number found"));

        System.out.println("Second Largest Number: " + secondLargest);
    }
}
