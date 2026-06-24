package org.techworldwithjosh._3.dsa;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] inputArray = {5, 1, 4, 2, 8};

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int[] traditionalArray = inputArray.clone();      // Create copy

        for (int i = 0; i < traditionalArray.length - 1; i++) { // Number of passes
            for (int j = 0; j < traditionalArray.length - 1 - i; j++) { // Compare adjacent

                if (traditionalArray[j] > traditionalArray[j + 1]) { // Swap if bigger

                    int temp = traditionalArray[j];      // Store current element
                    traditionalArray[j] = traditionalArray[j + 1]; // Move next element left
                    traditionalArray[j + 1] = temp;     // Put stored element right
                }
            }
        }

        System.out.println("Traditional Approach:");
        System.out.println(Arrays.toString(traditionalArray));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int[] modernArray = inputArray.clone();          // Create copy
        Arrays.sort(modernArray);                        // Built-in sorting

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(Arrays.toString(modernArray));
    }
}

