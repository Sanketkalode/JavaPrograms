package generics;

import java.util.List;

/**
 * @author SanketKalode
 * @date 01-04-2024
 */
public class BoundedParams {

    static <T extends Comparable<T>> void findMax(List<T> list) {

        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("list cannot be null or empty");
        }

        T max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(max) > 0) {
                max = currentElement;
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(3, 4, 7, 1, 45, 34);
        findMax(integerList);

        List<Double> doubleList = List.of(4.2, 3.1, 55.21, 64.45);
        findMax(doubleList);

    }
}
