package functionalInterface;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author SanketKalode
 * @date 23-05-2024
 */
public class DefaultFunctionalInterfaces {
    public static void main(String[] args) {

        Consumer<Integer> printNumber = System.out::println;

        Function<Integer, Integer> squareNumber = num -> num * num;

        Supplier<Integer> count = () -> 0;

        Predicate<Integer> isEven = num -> num % 2 == 0;

        List<Integer> integers = new Random().ints(10,1,10).boxed().toList();

        int countNums = integers.stream()
                .filter(isEven).distinct()
                .map(squareNumber)
                .peek(printNumber)
                .reduce(count.get(),(ct,num) -> ct+1);

        System.out.println(countNums);

    }
}
