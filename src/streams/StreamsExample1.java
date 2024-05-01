package streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 01-04-2024
 */
public class StreamsExample1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /*
         * Find the sum of square of even numbers in a list
         * */


        // this is the traditional way of find the sum
        int sum = 0;
        long start = System.currentTimeMillis();
        for (Integer integer : list) {
            int sq = 0;
            if (integer % 2 == 0) {
                sq = integer * integer;
                sum = sum + sq;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(sum);
        System.out.println(STR."Execution time: \{end - start}");


        // this same thing is done using streams.

        start = System.currentTimeMillis();
        int sumOfSquare = list.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();
        end= System.currentTimeMillis();
        System.out.println(sumOfSquare);
        System.out.println(STR."Execution time: \{end - start}");

        System.out.println();
    }
}
