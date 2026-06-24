package org.techworldwithjosh._2.data_structure;

import java.util.Arrays;

public class SumOfAllDigitsNumber {

    public static void main(String[] args) {

        int number = 12345;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int temp = number;                          // Copy original number
        int traditionalSum = 0;                     // Store digit sum

        while (temp > 0) {                          // Process each digit

            traditionalSum += temp % 10;            // Extract last digit

            temp = temp / 10;                       // Remove last digit
        }

        System.out.println("Traditional Approach:");
        System.out.println("Sum of Digits = " + traditionalSum);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int modernSum =
                String.valueOf(number)              // Convert number to String
                        .chars()                    // IntStream of characters
                        .map(ch -> ch - '0')        // Convert char to digit
                        .sum();                     // Sum all digits

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Sum of Digits = " + modernSum);
    }
}