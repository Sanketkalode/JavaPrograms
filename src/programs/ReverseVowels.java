package programs;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author SanketKalode
 * @date 22-03-2024
 */
public class ReverseVowels {

    static String reverseVowels(String s){
        int i = 0;
        int j = s.length() - 1;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] str = s.toCharArray();

        while (i < j) {
            if (vowels.contains(str[i]) && vowels.contains(str[j])) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            } else if (!vowels.contains(str[i])) {
                i++;
            } else if (!vowels.contains(str[j])) {
                j--;
            }
        }

        return new String(str);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("ai"));
    }
}
