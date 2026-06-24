package org.techworldwithjosh._3.dsa;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] inputArray = {38, 27, 43, 3, 9, 82, 10};

        // =====================================
        // Part 1 : Traditional Merge Sort
        // =====================================

        int[] traditionalArray = inputArray.clone(); // Create copy

        mergeSort(traditionalArray, 0, traditionalArray.length - 1);

        System.out.println("Traditional Approach:");
        System.out.println(Arrays.toString(traditionalArray));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        int[] modernArray = Arrays.stream(inputArray) // Convert array to stream
                .sorted() // Sort elements
                .toArray(); // Convert back to array

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(Arrays.toString(modernArray));
    }

    public static void mergeSort(int[] array, int left, int right) {

        if (left < right) { // More than one element
            int middle = left + (right - left) / 2; // Find middle index
            mergeSort(array, left, middle); // Sort left half

            mergeSort(array, middle + 1, right); // Sort right half

            merge(array, left, middle, right); // Merge both halves
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {

        int leftSize = middle - left + 1; // Left sub-array size
        int rightSize = right - middle; // Right sub-array size
        int[] leftArray = new int[leftSize]; // Left temporary array

        int[] rightArray = new int[rightSize]; // Right temporary array

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[left + i]; // Copy left elements
        }

        for (int j = 0; j < rightSize; j++) {
            rightArray[j] = array[middle + 1 + j]; // Copy right elements
        }

        int i = 0; // Left index
        int j = 0; // Right index
        int k = left; // Main array index

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i]; // Copy smaller value
                i++;
            } else {
                array[k] = rightArray[j]; // Copy smaller value
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftArray[i]; // Copy remaining left
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightArray[j]; // Copy remaining right
            j++;
            k++;
        }
    }
}