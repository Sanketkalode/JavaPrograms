package predicate;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAndStreams {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i -> i % 2 == 0;
        Predicate<Integer> isOdd = i -> i % 2 == 1;

        List<Integer> integers = new Random().ints(0,30)
                .limit(10).boxed().toList();
        System.out.println(integers);

        List<Integer> evenInts = integers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenInts);

        List<Integer> oddInts = integers.stream().filter(isOdd).collect(Collectors.toList());
        System.out.println(oddInts);
    }
}
