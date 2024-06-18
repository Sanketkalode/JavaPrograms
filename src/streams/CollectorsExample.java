package streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author SanketKalode
 * @date 21-05-2024
 */
public class CollectorsExample {
    public static void main(String[] args) {

        List<Integer> integers = new Random().ints(10, 20)
                .limit(50).boxed().toList();

        // Count number of occurrences of all the integers.
        Map<Object, Long> map = integers.stream().collect(Collectors.groupingBy(
                e -> e, Collectors.counting()
        ));
        System.out.println(map);

        // Creating unmodifiable set.
        Set<Integer> intSet = integers.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(intSet);

        // Creating a linked list from the int list.
        integers = new Random().ints(10, 1, 20).boxed().toList();
        List<Integer> integers1 = new LinkedList<>(integers);
        System.out.println(integers1);

        List<String> strings = Arrays.asList("Hello", "World", "abc", "Nami", "Boruto", "Jon Snow");
        Map<String, Integer> stringLength = strings.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(stringLength);

        // identity() method is a static method takes a input and returns it.

        /*
         * Collectors.collectingAndThen():
         *CollectingAndThen is a special collector that allows us to
         * perform another action on a result straight after collecting ends.
         * */

        Map<Integer, Long> even_occurances = integers.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(num -> num, Collectors.counting()), Map::copyOf));

        System.out.println(even_occurances);

        /*
        * keySet(): It is used to get all the keys from the map
        * entrySet(): It is used to get all the key and values from the hash map.
        * */
        System.out.println(STR."Keyset: \{even_occurances.keySet()}");
        System.out.println(STR."values:\{even_occurances.entrySet()}");

        /*
        * joining():
        * Joining collector can be used for joining Stream<String> elements.
        * */

        String joinedStrings = strings.stream().collect(Collectors.joining(", "));
        System.out.println(joinedStrings);

        /*
        * counting():
        * Counting is a simple collector that allows for the counting of all Stream elements.
        * */

        System.out.println(strings.stream().collect(Collectors.counting()));

        /*
        * summarizingDouble/Long/Int():
        * SummarizingDouble/Long/Int is a collector that returns a special class containing
        * statistical information about numerical data in a Stream of extracted elements.
        * */
        DoubleSummaryStatistics doubleSummaryStatistics = integers.stream()
                .collect(Collectors.summarizingDouble(e -> e));
        System.out.println(doubleSummaryStatistics);

        /*
        * averagingDouble/Long/Int():
        * AveragingDouble/Long/Int is a collector that simply returns an average of extracted elements.
        * */

        Double avg = integers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(integers);
        System.out.println(avg);

        /*
        * partitioningBy()
        * PartitioningBy is a specialized case of groupingBy that accepts a Predicate instance,
        * and then collects Stream elements into a Map instance that stores Boolean values as keys
        * and collections as values. Under the “true” key, we can find a collection of elements
        * matching the given Predicate, and under the “false” key, we can find a collection of elements
        * not matching the given Predicate.
        * */

        Predicate<Integer> isEven = i -> i % 2 == 0;
        Map<Boolean, List<Integer>> evenOdd = integers.stream().collect(Collectors.partitioningBy(isEven));
        System.out.println(evenOdd);
/*
        *//*
        * teeing():
        * offers a built-in collector that takes care of these steps on our behalf;
        * all we have to do is provide the two collectors and the combiner function.
        * *//*
        List<Object> minList = Collections.singletonList(integers.stream().collect(Collectors.teeing(
                Collectors.minBy(Integer::compareTo),
                Collectors.maxBy(Integer::compareTo),
                (min, max) -> Collectors.toList()
        )));
        System.out.println(minList);*/



    }
}
