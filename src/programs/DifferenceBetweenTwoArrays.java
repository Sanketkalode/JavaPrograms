package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SanketKalode
 * @date 26-03-2024
 */
public class DifferenceBetweenTwoArrays {

    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for (int j : nums1) {
            boolean flag = Arrays.stream(nums2).anyMatch(n -> n == j);
            if (!flag) {
                if (!arr1.contains(j)) {
                    arr1.add(j);
                }
            }
        }

        for (int j : nums2) {
            boolean flag = Arrays.stream(nums1).anyMatch(n -> n == j);
            if (!flag) {
                if (!arr2.contains(j)) {
                    arr2.add(j);
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(arr1);
        result.add(arr2);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,3};
        int[] nums2 = new int[]{1,1,2,2};

        System.out.println(findDifference(nums1, nums2));
    }
}
