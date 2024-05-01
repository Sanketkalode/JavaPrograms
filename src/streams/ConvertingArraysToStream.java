package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author SanketKalode
 * @date 01-04-2024
 */
public class ConvertingArraysToStream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        IntStream intStream = Arrays.stream(arr);
//        System.out.println(intStream.count());
        intStream.forEach(System.out::println);

        Integer[] arIntegers = {7,8,9};
        Stream<Integer> stream = Stream.of(arIntegers);
        System.out.println(stream.findFirst());
    }
}
