package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        List<Integer> integers = new Random().ints(0, 30)
                .limit(10).boxed().toList();
        System.out.println("List of Integers: " + integers);

        /*
         * 1. Calculate the average of a list of integers using streams.
         * */

        int avg = (int) integers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(STR."Avg: \{avg}");

        /*
         * 2. Convert a list of strings to uppercase or lowercase using streams.
         * */
        List<String> strings = Arrays.asList("luffy", "zoro", "sanji", "nami", "ussop", "chopper", "franky"
                , "brooke", "robin");
        System.out.println(STR."List of Strings: \{strings}");
        System.out.println(STR."Strings to uppercase: \{strings.stream()
                .map(String::toUpperCase)
                .toList()}");

        /*
         * 3. Calculate the sum of all even, odd numbers in a list using streams.
         * */
        System.out.println(STR."Sum of all even numbers: \{integers.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum()}");
        System.out.println(STR."Sum of all odd numbers: \{integers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum()}");

        /*
         * 4. Remove all duplicate elements from a list using streams.
         * */

//        System.out.println(integers.stream().collect(Collectors.toSet()));
        System.out.println(STR."Unique integers in list\{integers.stream().distinct().toList()}");

        /*
         * 5. Count the number of strings in a list that start with a specific letter using streams.
         * */

        System.out.println(STR."Names starts with l in list: \{strings.stream().filter(s -> s.startsWith("l")).toList()}");

        /*
         * 6. Sort a list of strings in alphabetical order, ascending and descending using streams.
         * */

        System.out.println(STR."Sorted List of names: \{strings.stream().sorted().toList()}");
        System.out.println(STR."List of name sorted in descending order: \{strings.stream().sorted(Comparator.reverseOrder()).toList()}");

        /*
         * 7. Find the maximum and minimum values in a list of integers using streams.
         * */
//        System.out.println(STR."Min int: \{integers.stream().sorted().findFirst()}");
//        System.out.println(STR."Max int: \{integers.stream().sorted(Comparator.reverseOrder()).findFirst()}");

        System.out.println(STR."Max int: \{integers.stream().max(Integer::compare).orElse(0)}");
        System.out.println(STR."Min int: \{integers.stream().min(Integer::compare).orElse(0)}");

        /*
         * 8. Find the second smallest and largest elements in a list of integers using streams.
         * */
        System.out.println(STR."2nd smallest distinct value in list: \{integers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0)}");
        System.out.println(STR."2nd largest distinct value in list: \{integers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0)}");

        /*
         * 9. Find sum of all distinct numbers from list
         * */

        System.out.println(STR."Sum of all distinct integers: \{integers.stream()
                .distinct()
                .reduce(0, Integer::sum)}");
    }
}
