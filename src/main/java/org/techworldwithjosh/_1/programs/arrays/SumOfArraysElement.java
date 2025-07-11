package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;

public class SumOfArraysElement {
    public static void main(String[] args) {
        Integer[] input = {9, 1, 3, 5, 7};

        int sum = Arrays.stream(input).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Array Elements: " + sum);
    }
}
