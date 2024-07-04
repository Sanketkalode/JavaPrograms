package programs;

import java.util.List;

/**
 * @author SanketKalode
 * @date 26-06-2024
 */
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(solution("the sky is blue"));
        System.out.println(solution("  hello world  "));
        System.out.println(solution("a good   example"));
    }

    static String solution(String s){
        List<String> stringList = List.of(s.split(" ")).reversed();
        StringBuilder string = new StringBuilder();
        for (String st : stringList){
            if (!st.isEmpty()){
                string.append(" ").append(st.trim());
            }
        }

        return string.toString().trim();
    }
}
