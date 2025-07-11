package org.techworldwithjosh._2.data_structure;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEvenOdd {
    public static void main(String[] args) {
        Integer[] numbers = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Count even and odd numbers using Streams
        Map<String, Long> countMap = Arrays.stream(numbers)
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd", Collectors.counting()));

        // Print counts
        System.out.println("Even Count: " + countMap.getOrDefault("Even", 0L));
        System.out.println("Odd Count: " + countMap.getOrDefault("Odd", 0L));

        long evenCount = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0) // Filter even numbers
                .count(); // Count them

        System.out.println("Count of Even Numbers: " + evenCount);
    }
}
