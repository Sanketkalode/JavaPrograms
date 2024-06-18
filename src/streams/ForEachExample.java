package streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author SanketKalode
 * @date 27-05-2024
 */
public class ForEachExample {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java", "Python", "C", "C++", "C#");
        strings.forEach(System.out::println);



    }
}
