package org.techworldwithjosh._1.programs.patterns;

public class BorderArray {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;

        // Create a 2D array of size 5x6
        int[][] array = new int[rows][cols];

        // Fill the array with border elements as 1 and inner elements as 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the current position is on the border, set it to 1
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;  // Inner elements are 0
                }
            }
        }

        // Print the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " "); // Print each element with a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
