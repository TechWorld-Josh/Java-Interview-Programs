package org.techworldwithjosh._2.data_structure;

public class SumOfAllDigitsNumber {
    public static void main(String[] args) {
        Integer inputNumber = 47862; // 47862 = 27

        // Sum the digits using Java 8 Streams
        int sum = inputNumber.toString() // Convert number to string
                .chars() // Convert each character to an IntStream
                .map(Character::getNumericValue) // Convert char to int
                .sum(); // Sum all digits

        System.out.println("Sum of digits: " + sum);

    }
}
