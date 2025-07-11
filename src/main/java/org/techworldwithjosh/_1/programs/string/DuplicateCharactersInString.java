package org.techworldwithjosh._1.programs.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String inputeString = "Better Butter"; // {r=2, B=2, t=4, e=3}
        String input = "JavaProgramming"; // {a=3, r=2, g=2, m=2}

        Map<Character, Long> duplicates = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate characters in the string: " + duplicates);
    }
}

