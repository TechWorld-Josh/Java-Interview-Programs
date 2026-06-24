package org.techworldwithjosh._2.data_structure;

import java.util.stream.IntStream;

public class PrimeNumbers {

    public static void main(String[] args) {

        int number = 29;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        boolean isPrimeTraditional = true;              // Assume prime

        for (int i = 2; i <= Math.sqrt(number); i++) { // Check divisors

            if (number % i == 0) {                  // Divisible found
                isPrimeTraditional = false;
                break;                              // Stop checking
            }
        }

        System.out.println("Traditional Approach:");

        if (isPrimeTraditional) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        // Must be > 1
        // Check till sqrt(n)
        boolean isPrimeModern =
                IntStream.rangeClosed(2, (int) Math.sqrt(number))                // Check till sqrt(n)
                        .noneMatch(i -> number % i == 0);               // No divisors

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        if (isPrimeModern) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }
    }
}
