package org.techworldwithjosh._1.programs.string;

import java.util.Stack;

public class ShortStringDecoder {

    public static String decode(String s) {
        if (s == null || s.isEmpty()) return "";

        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> results = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                counts.push(num);
                results.push(current);
                current = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int repeat = counts.pop();
                StringBuilder prev = results.pop();
                for (int i = 0; i < repeat; i++) {
                    prev.append(current);
                }
                current = prev;
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println("3[a]2[bc] -> " + decode("3[a]2[bc]")); // aaabcbc
        System.out.println("3[a2[c]] -> " + decode("3[a2[c]]"));   // accaccacc
        System.out.println("2[abc]3[cd]ef -> " + decode("2[abc]3[cd]ef")); // abcabccdcdcdef
    }
}