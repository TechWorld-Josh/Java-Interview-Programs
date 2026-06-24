package org.techworldwithjosh._1.programs.patterns;

import java.util.stream.IntStream;

public class PatternStar {

    public static void main(String[] args) {

        int n = 5;

        // ==================================================
        // 1. SQUARE STAR PATTERN
        // ==================================================

        System.out.println("===== Square Star Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 1; i <= n; i++) {                  // Rows

            for (int j = 1; j <= n; j++) {              // Columns

                System.out.print("* ");
            }

            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)
                .forEach(i -> {

                    IntStream.rangeClosed(1, n)
                            .forEach(j ->
                                    System.out.print("* "));

                    System.out.println();
                });

        // ==================================================
        // 2. INCREASING TRIANGLE STAR PATTERN
        // ==================================================

        System.out.println("\n===== Increasing Triangle Star Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)
                .forEach(i -> {

                    IntStream.rangeClosed(1, i)
                            .forEach(j ->
                                    System.out.print("* "));

                    System.out.println();
                });

        // ==================================================
        // 3. REVERSE TRIANGLE STAR PATTERN
        // ==================================================

        System.out.println("\n===== Reverse Triangle Star Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.iterate(n, i -> i >= 1, i -> i - 1)
                .forEach(i -> {

                    IntStream.rangeClosed(1, i)
                            .forEach(j ->
                                    System.out.print("* "));

                    System.out.println();
                });

        // ==================================================
        // 4. PYRAMID STAR PATTERN
        // ==================================================

        System.out.println("\n===== Pyramid Star Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {      // Spaces

                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) { // Stars

                System.out.print("*");
            }

            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)
                .forEach(i -> {

                    IntStream.rangeClosed(1, n - i)
                            .forEach(j ->
                                    System.out.print(" "));

                    IntStream.rangeClosed(1, (2 * i - 1))
                            .forEach(j ->
                                    System.out.print("*"));

                    System.out.println();
                });

        // ==================================================
        // 5. INVERTED PYRAMID STAR PATTERN
        // ==================================================

        System.out.println("\n===== Inverted Pyramid Star Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.iterate(n, i -> i >= 1, i -> i - 1)
                .forEach(i -> {

                    IntStream.rangeClosed(1, n - i)
                            .forEach(j ->
                                    System.out.print(" "));

                    IntStream.rangeClosed(1, (2 * i - 1))
                            .forEach(j ->
                                    System.out.print("*"));

                    System.out.println();
                });

        // ==================================================
        // 6. DIAMOND STAR PATTERN
        // ==================================================

        System.out.println("\n===== Diamond Star Pattern =====");

        // Part 1 : Traditional Approach
        System.out.println("Traditional Approach:");

        // Upper Half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        // Part 2 : Java 8 / 17 / 21 Approach
        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.rangeClosed(1, n)
                .forEach(i -> {

                    IntStream.rangeClosed(1, n - i)
                            .forEach(j -> System.out.print(" "));

                    IntStream.rangeClosed(1, (2 * i - 1))
                            .forEach(j -> System.out.print("*"));

                    System.out.println();
                });

        IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1)
                .forEach(i -> {

                    IntStream.rangeClosed(1, n - i)
                            .forEach(j -> System.out.print(" "));

                    IntStream.rangeClosed(1, (2 * i - 1))
                            .forEach(j -> System.out.print("*"));

                    System.out.println();
                });
    }
}
