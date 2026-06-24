package org.techworldwithjosh._1.programs.string;

public class ReverseEntireString {
    // =====================================
    // Part 1 : Traditional Approach
    // =====================================
    public static String reverseTraditional(String str) {

        StringBuilder result = new StringBuilder();   // Store reversed string

        for (int i = str.length() - 1; i >= 0; i--) { // Traverse from end
            result.append(str.charAt(i));             // Append character
        }

        return result.toString();
    }

    // =====================================
    // Part 2 : Java 8 / 17 / 21 Approach
    // =====================================
    public static String reverseModern(String str) {

        return new StringBuilder(str)     // Create StringBuilder
                .reverse()                // Reverse string
                .toString();              // Convert to String
    }

    public static void main(String[] args) {

        String str = "Times Of India";

        System.out.println("Traditional : " + reverseTraditional(str));
        System.out.println("Java 8/17/21 : " + reverseModern(str));
    }
}
