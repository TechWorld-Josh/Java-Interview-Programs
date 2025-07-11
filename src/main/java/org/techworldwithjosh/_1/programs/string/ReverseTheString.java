package org.techworldwithjosh._1.programs.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseTheString {
    public static void main(String[] args) {

        String input = "Times Of India";

        //1. Using iterative method ==> aidnI fO semiT
        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

        //2. Reverse each word of a string in Java 8 ==> semiT fO aidnI
        String result = Arrays.stream(input.split(" ")) // Split words
                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
                .collect(Collectors.joining(" ")); // Join words back

        System.out.println("Reversed Words String: " + result);

        //3. Reverse A Sentence Word By Word = Java Concept Of The Day ==> Day The Of Concept Java

    }
}
