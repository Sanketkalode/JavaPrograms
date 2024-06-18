package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @author SanketKalode
 * @date 14-06-2024
 */
public class FlatMapExample {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList(
                "Hello world",
                "Java Stream API",
                "Flatten list of strings"
        );

        // Step 2: Flatten the list of strings
        List<String> flattenedList = listOfStrings.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .collect(Collectors.toList());

        // Step 3: Print the flattened list
        System.out.println(flattenedList);

    }
}
