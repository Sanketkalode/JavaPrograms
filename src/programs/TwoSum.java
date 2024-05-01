package programs;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author SanketKalode
 * @date 02-04-2024
 */
public class TwoSum {

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (elements.containsKey(diff)) {
                return new int[]{elements.get(diff), i};
            } else {
                elements.put(arr[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,6};
        System.out.println(Arrays.toString(twoSum(arr, 4)));
    }
}
