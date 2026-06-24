package org.techworldwithjosh._3.dsa;

import java.util.PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {

        int[] inputArray = {7, 10, 4, 3, 20, 15};

        int k = 3;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int[] traditionalArray = inputArray.clone();     // Create copy

        Arrays.sort(traditionalArray);                   // Sort ascending

        int kthLargestTraditional = traditionalArray[traditionalArray.length - k]; // kth largest

        System.out.println("Traditional Approach:");
        System.out.println(k + "rd Largest Element = " + kthLargestTraditional);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();                  // Min Heap

        for (int num : inputArray) {                    // Traverse array
            minHeap.offer(num);                         // Add element
            if (minHeap.size() > k) {                  // Keep only k elements
                minHeap.poll();                        // Remove smallest
            }
        }
        int kthLargestModern = minHeap.peek();         // Top = kth largest

        System.out.println("\nJava 8 / 17 / 21 Approach:");
        System.out.println(k + "rd Largest Element = " + kthLargestModern);
    }
}
