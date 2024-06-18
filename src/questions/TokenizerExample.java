package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author SanketKalode
 * @date 07-06-2024
 */
public class TokenizerExample {
    public static void main(String[] args) {

        String str = "Monkey D. Luffy (strawhat)";
        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(str," ");
        while (tokenizer.hasMoreElements()){
            tokens.add(tokenizer.nextToken());
        }
        System.out.println(tokens);

        System.out.println(Collections.list(new StringTokenizer(str, " ")).stream()
                .map(token -> (String) token).toList());

        /*Multi delimiters*/

        System.out.println(Collections.list(new StringTokenizer("2*5-75/2+4","*-/+"))
                .stream().map(token ->(String) token).toList());
    }
}
