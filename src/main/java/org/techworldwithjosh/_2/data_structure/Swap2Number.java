package org.techworldwithjosh._2.data_structure;

public class Swap2Number {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swap without using a temporary variable using mathematical operations
        a = a + b;  // a becomes the sum of a and b
        b = a - b;  // b becomes the original value of a
        a = a - b;  // a becomes the original value of b

        // Swap using XOR without using a temporary variable
//        a = a ^ b;  // XOR the two numbers and store in a
//        b = a ^ b;  // XOR the result with b to get the original value of a
//        a = a ^ b;  // XOR the result with b to get the original value of b

        System.out.println("Swapped numbers: " + a + " and " + b);

        //Using temp
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped numbers: " + a + " and " + b);
    }
}
