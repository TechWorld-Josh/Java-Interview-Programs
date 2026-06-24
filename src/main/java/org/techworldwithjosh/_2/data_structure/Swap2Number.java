package org.techworldwithjosh._2.data_structure;

import java.util.concurrent.atomic.AtomicInteger;

public class Swap2Number {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        int first = firstNumber;                    // Copy first number
        int second = secondNumber;                  // Copy second number

        System.out.println("Traditional Approach:");

        System.out.println("Before Swapping:");
        System.out.println("First Number  = " + first);
        System.out.println("Second Number = " + second);

        int temp = first;                           // Store first number

        first = second;                             // Assign second to first

        second = temp;                              // Assign temp to second

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number  = " + first);
        System.out.println("Second Number = " + second);

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        AtomicInteger num1 = new AtomicInteger(firstNumber);
        AtomicInteger num2 = new AtomicInteger(secondNumber);

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        System.out.println("Before Swapping:");
        System.out.println("First Number  = " + num1.get());
        System.out.println("Second Number = " + num2.get());

        num1.getAndUpdate(value -> num2.get());     // Update first
        num2.set(firstNumber);                      // Update second

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number  = " + num1.get());
        System.out.println("Second Number = " + num2.get());
    }
}
