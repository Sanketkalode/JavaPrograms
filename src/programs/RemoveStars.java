package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author SanketKalode
 * @date 23-03-2024
 */
public class RemoveStars {
    static String removeStars(String s) {
        List<Character> chars = new ArrayList<>();
        char[] charList = s.toCharArray();

        for (char c : charList) {
            if (c != '*') {
                chars.add(c);
            } else {
                chars.remove(chars.size() - 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("erase*****"));
    }
}
