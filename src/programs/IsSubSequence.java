package programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 27-06-2024
 */
public class IsSubSequence {
    public static void main(String[] args) {

        System.out.println(isSubsequence("abc", "adfdbefdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));
    }

    static boolean isSubsequence(String s, String t) {

        if (s.length() == t.length()) {
            return s.equals(t);
        }

        List<Integer> seq = new ArrayList<>();
        /*for (int i =0;i< s.length();i++){
            if (t.contains(Character.toString(s.charAt(i)))){
                if (!seq.contains(t.indexOf(s.charAt(i)))){
                    seq.add(t.indexOf(s.charAt(i)));
                }else {
                    seq.add(-1);
                }

            }else {
                seq.add(-1);
            }
        }
        if (!seq.contains(-1)){
            for (int i =0;i< seq.size()-1;i++){
                if (seq.get(i) > seq.get(i+1)){
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;*/
        for (int i = 0; i < t.length(); i++) {
            if (s.contains(Character.toString(t.charAt(i)))) {
                seq.add(i);
            }
        }

        boolean flag = false;

        for (int i = 0; i < seq.size() - 1; i++) {
            if (seq.get(i) < seq.get(i + 1)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        return flag;
    }
}
