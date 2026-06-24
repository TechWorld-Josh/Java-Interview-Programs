package org.techworldwithjosh._1.programs.mattrix;

import java.util.Arrays;

public class RotateMatrixClockwise {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int n = matrix.length;                    // Matrix size
        int[][] rotated = new int[n][n];          // New matrix

        for (int i = 0; i < n; i++) {             // Traverse rows
            for (int j = 0; j < n; j++) {         // Traverse columns
                rotated[j][n - 1 - i] = matrix[i][j];
                // Place element in rotated position
            }
        }

        System.out.println("Traditional Approach:");

        for (int[] row : rotated) {
            System.out.println(Arrays.toString(row));
        }

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int[][] modernMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotateClockwise(modernMatrix);

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        Arrays.stream(modernMatrix)
                .forEach(row -> System.out.println(Arrays.toString(row)));
    }

    public static void rotateClockwise(int[][] matrix) {

        int n = matrix.length;

        // Reverse rows
        for (int top = 0, bottom = n - 1; top < bottom; top++, bottom--) {

            int[] temp = matrix[top];
            matrix[top] = matrix[bottom];
            matrix[bottom] = temp;
        }

        // Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}