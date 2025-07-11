package org.techworldwithjosh._2.data_structure;


import java.util.stream.Stream;

public class FibonacciSeries {
    static void Fibonacci(Integer n) {
        int num1 = 0, num2 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(num1 + " ");

            //swap
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        Fibonacci(n);

        // Generate Fibonacci series using Java 8 Stream
        Stream.iterate(new Integer[]{0, 1}, f -> new Integer[]{f[1], f[0] + f[1]})
                .limit(n) // Limit the sequence to 'n' Fibonacci numbers
                .map(f -> f[0]) // Map to get the first number of the pair (Fibonacci number)
                .forEach(System.out::println); // Print each Fibonacci number
    }
}
