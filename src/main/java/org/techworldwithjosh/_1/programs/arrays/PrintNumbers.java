package org.techworldwithjosh._1.programs.arrays;

import java.util.stream.IntStream;

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 10;
        //IntStream.rangeClosed(1, 10).forEach(System.out::println);
        for (int i = 0; i <= n; i++) {
            System.out.printf(" " + i);
        }
    }
}
