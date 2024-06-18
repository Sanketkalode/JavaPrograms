package programs;

import java.util.ArrayList;
import java.util.List;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		MergeStringsAlternately m1 = new MergeStringsAlternately();
		System.out.println(m1.mergeAlternately("abcd","pq"));
	}

    String mergeAlternately(String word1, String word2) {
        StringBuilder word = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());

        for (int i = 0; i < length; i++) {
            word.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (word1.length() > length) {
            word.append(word1.substring(length));
        } else if (word2.length() > length) {
            word.append(word2.substring(length));
        }

        return word.toString();
    }
}
