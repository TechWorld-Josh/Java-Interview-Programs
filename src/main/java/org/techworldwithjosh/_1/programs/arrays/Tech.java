package org.techworldwithjosh._1.programs.arrays;

import java.util.Arrays;
import java.util.List;

public class Tech {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9,1,3,5);

//Find the average of Array List

        double result = numbers.stream().mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(result);
    }
}
