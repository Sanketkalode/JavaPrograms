package programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 21-03-2024
 */
public class GreatestCandies {

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies among all kids
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Check if each kid can have the maximum number of candies with extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
