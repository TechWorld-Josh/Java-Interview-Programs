package org.techworldwithjosh.Logical_programming;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s1 = "[]";
        String s2 = "([{}])";
        String s3 = "[(])";

        // =====================================
        // Part 1 : Traditional Approach
        // =====================================

        System.out.println("Traditional Approach:");
        System.out.println(s1 + " -> " + isValidTraditional(s1));
        System.out.println(s2 + " -> " + isValidTraditional(s2));
        System.out.println(s3 + " -> " + isValidTraditional(s3));

        // =====================================
        // Part 2 : Java 8 / 17 / 21 Approach
        // =====================================

        System.out.println("\nJava 8 / 17 / 21 Approach:");

        System.out.println(s1 + " -> " + isValidModern(s1));
        System.out.println(s2 + " -> " + isValidModern(s2));
        System.out.println(s3 + " -> " + isValidModern(s3));
    }

    public static boolean isValidTraditional(String s) {

        Stack<Character> stack = new Stack<>(); // Store opening brackets

        for (char ch : s.toCharArray()) { // Traverse characters
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening bracket

            } else {
                if (stack.isEmpty()) {
                    return false; // No opening bracket found
                }
                char top = stack.pop(); // Remove top element
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Stack should be empty
    }

    public static boolean isValidModern(String s) {

        Stack<Character> stack = new Stack<>(); // Store opening brackets

        Map<Character, Character> brackets = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        ); // Mapping

        for (char ch : s.toCharArray()) {
            if (brackets.containsValue(ch)) {
                stack.push(ch); // Opening bracket
            } else if (brackets.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
