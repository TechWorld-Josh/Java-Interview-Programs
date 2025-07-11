package org.techworldwithjosh._1.programs.patterns;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        // Print the star pattern using a simple loop
        for (int i = 1; i <= rows; i++) {   // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for printing stars
                System.out.print("* ");      // Print a star followed by a space
            }
            System.out.println();            // Move to the next line after each row
        }
    }
}
