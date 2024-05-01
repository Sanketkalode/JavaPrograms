package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SanketKalode
 * @date 01-04-2024
 */
public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello","world");

        List<String> stringList = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(stringList);

        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer> integers = lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(integers);


        List<String> stringList1 = Arrays.asList("abc","perd","qedzd","liser");

        List<String> stringList2 = stringList1.stream()
                .map(str -> str.substring(0,2)).sorted()
                .collect(Collectors.toList());
        System.out.println(stringList2);

    }
}
