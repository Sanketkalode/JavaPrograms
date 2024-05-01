package programs;

import java.util.Arrays;

/**
 * @author SanketKalode
 * @date 21-03-2024
 */
public class MoveZeros {

    static void moveZeros(int[] nums) {
        int i = 0;
        int j = 0;

        if (nums.length >= 2) {
            while (j <= nums.length) {
                if (nums[i] == 0 && nums[j] > 0) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                } else if (nums[i] == 0 && nums[j] == 0) {
                    j++;
                }

                if (i == j) {
                    j++;
                }
                if (j == nums.length) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = new int[]{0, 1};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
