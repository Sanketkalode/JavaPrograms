package programs;

import java.util.ArrayList;
import java.util.List;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		MergeStringsAlternately m1 = new MergeStringsAlternately();
		System.out.println(m1.mergeAlternately("abcd","pq"));
	}
	
    String mergeAlternately(String word1, String word2) {
        int word1len = word1.length();
        int word2len = word2.length();
        boolean flag = true;
        String word = "";
        int i = 0;

        while(flag){
            word = word + word1.charAt(i) + word2.charAt(i);
            i++;
            word1len--;
            word2len--;
            if (word1len == 0){
                for (int j =i ; j<word2.length(); j++){
                    word = word + word2.charAt(j);
                }
                flag = false;
            }
            else if (word2len == 0){
                for (int j =i ; j<word1.length(); j++){
                    word = word + word1.charAt(j);
                }
                flag = false;
            }
        }
        
        List<Integer> a = new ArrayList<Integer>();

        return word;
    }
}
