package programs;

import java.util.Arrays;

/**
 * @author SanketKalode
 * @date 25-06-2024
 */
public class SquareSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSquareSortedArray(new int[]{6, -8, 3, -1, 4})));
    }

    static int[] getSquareSortedArray (int[] arr) {
        // add your logic here
        int[] sqarr = new int[arr.length];

        for (int i = 0;i< arr.length; i++) {
            sqarr[i] = arr[i] * arr[i];
        }

        return Arrays.stream(sqarr).sorted().toArray();
    }
}
