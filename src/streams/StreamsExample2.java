package streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SanketKalode
 * @date 02-04-2024
 */
public class StreamsExample2 {
    public static void main(String[] args) {

        // creating list of random 10 numbers between 0 and 30
        List<Integer> integers = new Random().ints(0,30)
                .limit(10).boxed().toList();
        System.out.println(
                integers
        );

        // sorting list
        integers = integers.stream().sorted().toList();

        // creating list of even numbers
        int countEven = (int) integers.stream()
                .filter(i -> i %2 == 0).distinct()
                .peek(System.out::println)
                .count();
        System.out.println(STR."Total even numbers in list: \{countEven}");

        List<Integer> greaterThanTen = integers.stream()
                        .filter(n -> n > 10).distinct()
                        .toList();
        System.out.println(STR."Numbers greater than 10: \{greaterThanTen}");

        int sum = integers.stream()
                        .mapToInt(Integer::intValue)
                                .sum();
        System.out.println(STR."Sum of all the numbers: \{sum}");

        System.out.println(integers);
    }
}
