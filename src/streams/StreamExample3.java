package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SanketKalode
 * @date 05-04-2024
 */
public class StreamExample3 {
    public static void main(String[] args) {

        List<Integer> list = new Random().ints(0, 5)
                .limit(10).boxed().toList();

        System.out.println(list);

        // Counting number of occurances of each number in a list.
        Map<Integer, Long> countMap = list.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        System.out.println(countMap);

        // Creating a flatmap of the list of list of strings
        List<List<String>> lists = List.of(
                List.of("abc","123"),
                List.of("pqr","456"),
                List.of("xyz","789")
        );
        System.out.println(lists);
        List<String> newStringList =  lists.stream().flatMap(Collection::stream).toList();
        System.out.println(newStringList);


        // reduce method.
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<String> strings = Arrays.asList("a","b","c","d","e");
        String str = strings.stream().reduce("",(init,st)  -> (init.toUpperCase()+st.toUpperCase()));
        System.out.println(str);

        //foreach method.

        strings.forEach(s -> System.out.println(s.toUpperCase()));
        list.forEach(i -> System.out.println((i+1)));

        System.out.println(strings.stream().anyMatch(s -> s.equals("e8")));

        System.out.println(newStringList.stream().anyMatch(s -> s.startsWith("x")));

        list = new Random().ints(0, 50)
                .limit(100).boxed().toList();
        System.out.println(list.stream().distinct().sorted().toList().reversed());
        System.out.println(list.stream().distinct().sorted().toList().reversed().get(1));
    }
}
