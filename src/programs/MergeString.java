package programs;

/**
 * @author SanketKalode
 * @date 21-03-2024
 */
public class MergeString {

    static String mergeString(String word1, String word2) {

        if (word1.isEmpty()) {
            return word2;
        } else if (word2.isEmpty()) {
            return word1;
        }

        StringBuilder newWordBuilder = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            newWordBuilder.append(word1.charAt(i++)).append(word2.charAt(j++));
        }

        if (i < word1.length()) {
            newWordBuilder.append(word1.substring(i));
        } else if (j < word2.length()) {
            newWordBuilder.append(word2.substring(j));
        }

        return newWordBuilder.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcxyz";
        String word2 = "";

        System.out.println(mergeString(word1,word2));
    }
}
