package streams;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author SanketKalode
 * @date 24-05-2024
 */
public class StreamOperations {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("jane");
        stringList.add("bob");
        stringList.add("jackson");
        stringList.add("Mike");
        stringList.add("peter");
        stringList.add("Wanda");

        // Iterating list using streams.
        System.out.println("Iterating list using Streams");
        boolean containsA = stringList.stream().anyMatch(a -> a.contains("a"));
        System.out.println(containsA);

        List<Integer> integers = new Random().ints(10, 1, 10).boxed().toList();

        // Filtering list using streams.
        System.out.println("Filtering list using Streams");
        List<Integer> evenIntegers = integers.stream().filter(s -> s % 2 == 0).toList();
        System.out.println(evenIntegers);
        System.out.println(stringList.stream().filter(a -> a.contains("a")).toList());

        // Mapping a list to another collection using streams.

        System.out.println(stringList.stream().map(String::toUpperCase).toList());

        // Converting list of list of integers to list of integers using flatmap.
        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(43, 4, 55, 223, 12),
                Arrays.asList(9, 34, 25)
        );


        System.out.println(listOfList.stream().flatMap(Collection::stream).toList());

        // Matching

        boolean match1 = stringList.stream().anyMatch(a -> a.contains("a"));
        boolean match2 = stringList.stream().anyMatch(a -> a.contains("x"));
        System.out.println(match1);
        System.out.println(match2);

        // Reduce

        int sum = integers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(integers);
        System.out.println(integers.stream()
                .reduce(0, (a, b) -> a > b ? a : b));

        /*
        * In below example we are filtering out odd numbers, sorting it and collecting them into list.
        * In streams intermediate operations does not process data/stream until there is terminal operation
        * is present. In below example in 1st line of code which is filtering operation and storing stream in
        * new stream. In this only stream is configured and actual list processing doesn't happen until now.
        * Same of the sorted operation also. When toList() is called at that time filtering and sorting operations
        * are performed on the stream as toList() is the terminal operation. Util any terminal operation is
        * performed stream only is only configured.
        * */

        Stream<Integer> abc = integers.stream().filter(a -> a % 2 != 0);
        Stream<Integer> sort = abc.sorted();
        System.out.println(sort);
        System.out.println(sort.toList());

    }
}
