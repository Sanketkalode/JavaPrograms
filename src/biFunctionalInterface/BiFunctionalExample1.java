package biFunctionalInterface;

import java.util.function.BiFunction;

/**
 * @author SanketKalode
 * @date 02-04-2024
 */
public class BiFunctionalExample1 {
    public static void main(String[] args) {

        /*
         * The BiFunction interface allows us to use parameters of different types,
         * with a return value of a third type.
         * */

        BiFunction<Integer, Integer, Integer> sumFunction = (a, b) -> a*a + b*b;
        System.out.println(sumFunction.apply(2, 3));

        BiFunction<Integer, Integer, Integer> productFunction = (a, b) -> a * b;
        System.out.println(productFunction.apply(2, 3));

        sumFunction = sumFunction.andThen(a -> a * 4);
        System.out.println(sumFunction.apply(3,4));


    }
}
