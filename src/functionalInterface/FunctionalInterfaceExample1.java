package functionalInterface;

import java.util.Objects;
import java.util.function.Function;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */
public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        Function<Integer, String> intToString = Objects::toString;
        Function<String, String> quote = s -> STR."'\{s}'";

        Function<Integer,String> intToQuoteString = quote.compose(intToString);
        System.out.println(intToQuoteString.apply(4));

        intToQuoteString = intToQuoteString.andThen(a -> STR."\{a} is converted from int to String");

        System.out.println(intToQuoteString.apply(5));
    }
}
