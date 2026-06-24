package org.techworldwithjosh._1.programs.patterns;

import java.util.stream.IntStream;

public class NumberPatternPrograms {
    public static void main(String[] args) {

        int n = 5;

        // ==================================================
        // 1. SQUARE PATTERN
        // ==================================================

        System.out.println("===== Square Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 1; i <= n; i++) {               // Rows
            for (int j = 1; j <= n; j++) {           // Columns
                System.out.print("1 ");
            }
            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)                  // Generate rows
                .forEach(i -> {
                    IntStream.rangeClosed(1, n)      // Generate columns
                            .forEach(j -> System.out.print("1 "));
                    System.out.println();
                });

        // ==================================================
        // 2. INCREASING NUMBER TRIANGLE
        // ==================================================

        System.out.println("\n===== Increasing Number Triangle =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 1; i <= n; i++) {               // Rows
            for (int j = 1; j <= i; j++) {           // Numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)                  // Rows
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)      // Numbers
                            .forEach(j -> System.out.print(j + " "));
                    System.out.println();
                });

        // ==================================================
        // 3. FLOYD'S TRIANGLE
        // ==================================================

        System.out.println("\n===== Floyd's Triangle =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        int number = 1;                              // Starting number

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        final int[] counter = {1};                   // Mutable counter

        IntStream.rangeClosed(1, n)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(j -> System.out.print(counter[0]++ + " "));
                    System.out.println();
                });

        // ==================================================
        // 4. REVERSE NUMBER TRIANGLE
        // ==================================================

        System.out.println("\n===== Reverse Number Triangle =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.iterate(n, i -> i >= 1, i -> i - 1)
                .forEach(i -> {
                    IntStream.rangeClosed(1, i)
                            .forEach(j -> System.out.print(j + " "));
                    System.out.println();
                });

        // ==================================================
        // 5. PYRAMID PATTERN
        // ==================================================

        System.out.println("\n===== Pyramid Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {       // Spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {           // Numbers
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)
                .forEach(i -> {

                    IntStream.rangeClosed(1, n - i)
                            .forEach(j -> System.out.print(" "));

                    IntStream.rangeClosed(1, i)
                            .forEach(j -> System.out.print(j + " "));
                    System.out.println();
                });

        // ==================================================
        // 6. PASCAL TRIANGLE
        // ==================================================

        System.out.println("\n===== Pascal Triangle =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 0; i < n; i++) {

            int value = 1;                           // First value

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.range(0, n)
                .forEach(i -> {
                    final int[] value = {1};
                    IntStream.rangeClosed(0, i)
                            .forEach(j -> {
                                System.out.print(value[0] + " ");

                                value[0] = value[0] * (i - j) / (j + 1);
                            });

                    System.out.println();
                });
    }
}
