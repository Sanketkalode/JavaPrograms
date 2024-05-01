package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SanketKalode
 * @date 23-03-2024
 */
public class AsteroidCollision {
    static int[] asteroidCollision(int[] asteroids) {

        List<Integer> result = new ArrayList<>();

        for (int i : asteroids) {
            if (!result.isEmpty()) {
                if (i > 0 & result.get(result.size() - 1) > 0 || i < 0 & result.get(result.size() - 1) < 0) {
                    result.add(i);
                } else {
                    if (result.get(result.size() - 1) > 0 && i < 0) {
                        boolean flag = true;
                        while (flag) {
                            if (Math.abs(result.get(result.size() - 1)) > Math.abs(i)) {
                                flag = false;
                            } else if (Math.abs(result.get(result.size() - 1)) < Math.abs(i)) {
                                flag = false;
                                result.add(i);
                            } else {
                                result.remove(result.size() - 1);
                                flag = false;
                            }
                        }
                    } else if (result.get(result.size() - 1) > 0 && i < 0 && Math.abs(i) == Math.abs(result.get(result.size() - 1))
                            || result.get(result.size() - 1) < 0 && i > 0 && Math.abs(i) == Math.abs(result.get(result.size() - 1))) {
                        result.remove(result.size() - 1);
                    } else {
                        result.add(i);
                    }
                }
            } else {
                result.add(i);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10,2,-5})));
    }
}
