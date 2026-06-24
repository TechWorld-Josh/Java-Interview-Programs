package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {

    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static int[] rotateTraditional(int[] arr, int k) {

        int n = arr.length; // Array size
        k = k % n; // Handle k > n
        int[] rotated = new int[n]; // Result array

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i]; // Place element at new position
        }
        return rotated;
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static int[] rotateModern(int[] arr, int k) {

        int n = arr.length; // Array size
        k = k % n; // Handle k > n

        int finalK = k;
        return IntStream.range(0, n) // Generate indexes 0 to n-1
                .map(i -> arr[(i - finalK + n) % n]) // Calculate rotated position
                .toArray(); // Convert stream to array
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        int[] traditionalResult = rotateTraditional(arr, k);
        int[] modernResult = rotateModern(arr, k);

        System.out.println("Traditional Approach : " + Arrays.toString(traditionalResult));
        System.out.println("Java 8 / 17 / 21 Approach : " + Arrays.toString(modernResult));
    }
}
