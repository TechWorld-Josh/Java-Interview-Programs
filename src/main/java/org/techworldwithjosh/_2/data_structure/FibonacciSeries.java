package org.techworldwithjosh._2.data_structure;


import java.util.stream.Stream;

public class FibonacciSeries {

    public static void main(String[] args) {

        int number = 10;                           // Number of terms

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int first = 0;                             // First Fibonacci number
        int second = 1;                            // Second Fibonacci number

        System.out.println("Traditional Approach:");
        for (int i = 1; i <= number; i++) {        // Generate Fibonacci series
            System.out.print(first + " ");         // Print current number

            int next = first + second;             // Calculate next number
            first = second;                        // Move second to first
            second = next;                         // Move next to second
        }

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        System.out.println("\n\nJava 8 / 17 / 21 Approach:");

        Stream.iterate(new int[]{0, 1},           // Initial pair
                        arr -> new int[]{
                                arr[1],            // New first
                                arr[0] + arr[1]    // New second
                        })
                .limit(number)                     // Generate n terms
                .map(arr -> arr[0])                // Extract Fibonacci value
                .forEach(num -> System.out.print(num + " "));
    }
}
