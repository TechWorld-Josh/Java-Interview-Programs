package org.techworldwithjosh._2.data_structure;

import java.util.stream.IntStream;

public class FactorialNumber {

    public static void main(String[] args) {

        int number = 5;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        long factorialTraditional = 1;                  // Store factorial result

        for (int i = 1; i <= number; i++) {             // Traverse from 1 to number
            factorialTraditional *= i;                  // Multiply current number
        }

        System.out.println("Traditional Approach:");
        System.out.println("Factorial of " + number + " = " + factorialTraditional);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        long factorialModern = IntStream.rangeClosed(1, number) // Generate numbers from 1 to number
                .reduce(1, (a, b) -> a * b); // Multiply all numbers

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println("Factorial of " + number + " = " + factorialModern);
    }
}
