package org.techworldwithjosh._1.programs.patterns;

import java.util.stream.IntStream;

public class BorderArray {

    public static void main(String[] args) {

        int rows = 5;    // Number of rows
        int cols = 6;    // Number of columns

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        System.out.println("Traditional Approach:");

        for (int i = 0; i < rows; i++) {              // Traverse rows

            for (int j = 0; j < cols; j++) {          // Traverse columns

                if (i == 0                            // First row
                        || i == rows - 1             // Last row
                        || j == 0                    // First column
                        || j == cols - 1) {          // Last column

                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();                     // Move to next line
        }

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        IntStream.range(0, rows)
                .forEach(i -> {

                    IntStream.range(0, cols)
                            .forEach(j ->

                                    System.out.print(
                                            (i == 0
                                                    || i == rows - 1
                                                    || j == 0
                                                    || j == cols - 1)
                                                    ? "1 "
                                                    : "0 ")
                            );

                    System.out.println();
                });
    }
}
