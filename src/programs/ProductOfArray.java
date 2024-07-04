package programs;

import java.util.Arrays;

/**
 * @author SanketKalode
 * @date 26-06-2024
 */
public class ProductOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            product[i] = 1;
        }

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            product[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            product[i] *= suffix;
            suffix *= nums[i];
        }

        return product;
    }
}
