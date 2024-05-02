package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */
public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {

        /*
         * Functional Interface: Functional interface is a interface which has only one abstract method.
         * They have only one functionality to exhibit. Lambda expression can be used to demonstrate the functional
         * interface. These functional interface has only one input argument.
         *
         * Some inbuilt java functional interfaces
         *
         * Runnable –> This interface only contains the run() method.
         * Comparable –> This interface only contains the compareTo() method.
         * ActionListener –> This interface only contains the actionPerformed() method.
         * Callable –> This interface only contains the call() method.
         * */

        Function<Integer, String> intToString = Objects::toString;
        Function<String, String> quote = s -> STR."'\{s}'";

        Function<Integer, String> intToQuoteString = quote.compose(intToString);
        System.out.println(intToQuoteString.apply(4));

        intToQuoteString = intToQuoteString.andThen(a -> STR."\{a} is converted from int to String");

        System.out.println(intToQuoteString.apply(5));


        Function<Integer, List<Integer>> genrateSeq = n -> {
            List<Integer> seq = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                seq.add(i);
            }
            return seq;
        };

        System.out.println(genrateSeq.apply(50).stream().filter(n -> n % 2 == 0).toList());
    }
}
