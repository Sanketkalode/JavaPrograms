package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */
public class SortTimeComplexity {
    public static void main(String[] args) {

        int[] nums1 = new Random().ints(0,100000).limit(70000).toArray();

        long start = System.currentTimeMillis();
        Arrays.sort(nums1);
        long end = System.currentTimeMillis();

        System.out.println(STR."Simple sort: \{end - start}");

        int[] nums2 = new Random().ints(0,100000).limit(70000).toArray();

        start = System.currentTimeMillis();
        Arrays.parallelSort(nums2);
        end = System.currentTimeMillis();
        System.out.println(STR."Parallel sort: \{end - start}");

        System.out.println(List.of("MM").containsAll(Arrays.asList("MM")));

    }
}
