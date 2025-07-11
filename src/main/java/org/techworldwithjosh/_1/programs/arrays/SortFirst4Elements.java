package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;

public class SortFirst4Elements {
    public static void main(String[] args) {
        int[] inputArray = {9, 3, 1, 5, 7, 8, 2};

        //Sorting first 4 element
        Arrays.sort(inputArray, 0, 4);
        System.out.println((Arrays.toString(inputArray)));
    }
}
