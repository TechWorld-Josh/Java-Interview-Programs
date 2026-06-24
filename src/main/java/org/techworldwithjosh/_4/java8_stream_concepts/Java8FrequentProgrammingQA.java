package org.techworldwithjosh._4.java8_stream_concepts;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8FrequentProgrammingQA {
    public static void main(String[] args) {

        String input = "ilovejavatechi";

        /* find each char occurrence */
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        /* find all duplicate element from a given String */
        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);

        /* find all uniqueElements element from a given String */
        List<String> uniqueElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqueElements);

        /** find first non repeat element from a string **/
        String firstNonRepeatedElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println("1st Non repeat element " + firstNonRepeatedElement);

        int[] numbers = {5, 9, 11, 2, 8, 21, 1};

        /** Find second highest number from array **/
        Integer secondHighestNumber = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second highest number : " + secondHighestNumber);

        String[] strArray = {"java", "springboot", "microservices"};

        /** find the longest string from given array **/
        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        /** find element from array who starts with 1 **/
        List<String> stringList = Arrays.stream(numbers)
                .boxed()
                .map(s -> s + "") // convert integer to stream
                .filter(s -> s.startsWith("1"))
                .toList();
        System.out.println(stringList);

        // String.join method
        List<String> nos = Arrays.asList("1", "2", "3", "4");
        // 1-2-3-4
        String results = String.join("-", nos);
        System.out.println(results);

        // skip & limit example (2-9)
        IntStream.rangeClosed(1, 10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

        numbers2.stream().filter(n->n%2 == 0)
                .forEach(System.out::println);

    }
}
