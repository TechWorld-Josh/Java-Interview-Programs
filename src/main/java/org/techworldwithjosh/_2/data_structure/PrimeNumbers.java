package org.techworldwithjosh._2.data_structure;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 30; // Upper limit for finding prime numbers

        // Generate prime numbers using Java 8 Stream
        IntStream.range(2, n + 1) // Generate numbers from 2 to n
                .filter(PrimeNumbers::isPrime) // Filter out non-prime numbers
                .forEach(System.out::println); // Print each prime number
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        return IntStream.range(2, (int) Math.sqrt(number) + 1) // Check divisibility from 2 to sqrt(number)
                .noneMatch(i -> number % i == 0); // No number should divide the input number
    }
}
