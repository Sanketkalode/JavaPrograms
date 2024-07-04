package streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author SanketKalode
 * @date 26-06-2024
 */
public class StreamsQues {
    public static void main(String[] args) {

//        1. Find the Employee with the hightest salary from a list of employee objects using streams.

        List<Employee> employees = Arrays.asList(
                new Employee("Luffy",101,"Monster Trio","luffy@strawhats.com"),
                new Employee("Zoro",100,"Monster Trio","zoro@strawhats.com"),
                new Employee("Sanji",100,"Monster Trio","sanji@strawhats.com"),
                new Employee("Nami",500,"Weak Trio","nami@strawhats.com"),
                new Employee("Usopp",100,"Weak Trio","usopp@strawhats.com"),
                new Employee("Chopper",100,"Weak Trio","chopper@strawhats.com"),
                new Employee("Robin",600,"Weird Trio","robin@strawhats.com"),
                new Employee("Franky",100,"Weird Trio","franky@strawhats.com"),
                new Employee("Brooke",900,"Weird Trio","brooke@strawhats.com"),
                new Employee("Jimbe",100,"Sensible","jimbe@strawhats.com"),
                new Employee("strawhat",100,"Sensible","luffy@strawhats.com"),
                new Employee("cat burglar",100,"Sensible","nami@strawhats.com")
        );

        Employee max = employees.stream().max(Comparator.comparingInt(Employee::getSalary)).get();

        System.out.println(max);

//        2. Concatenate a list of strings into a single string, separated by commans
        List<String> strings = Arrays.asList("Hello", "World", "How", "are", "you");
        String concat = strings.stream().collect(Collectors.joining( ","));
        System.out.println(concat);

//        3. Find the first non-repeating char in a stirng using streams
        char ch = "Hello World" .chars().mapToObj(c -> (char) c).reduce((a, b) -> a == b ? 0 : a).get();
        System.out.println(ch);

//        4. Filter out movies of a specific genre and collect them inta set using streams.
        List<Movie> movies = Arrays.asList(
                new Movie("The Shawshank Redemption",1992,"Drama", 9.2),
                new Movie("The Godfather",1984,"Crime", 9.2),
                new Movie("The Dark Knight",2009,"Action", 9.0),
                new Movie("12 Angry Men",2001,"Action", 8.9),
                new Movie("Schindler's List",1991,"Historic", 8.9),
                new Movie("The Lord of the Rings: The Return of the King",2003,"Fantasy", 8.9),
                new Movie("Pulp Fiction",1994,"Drama", 8.8));

        List<Movie> movieList = movies.stream().filter(m -> m.getGenre().equals("Drama")).toList();

        System.out.println(movieList);


//        5. Find the first name of the oldest person in a list of people.

//        6. Filter out null values from a list of strings using streams.
        List<String> strs = Arrays.asList("Hello", "World", "How", "are", "you", null, "Sanket", null, null);
        System.out.println(strs.stream().filter(Objects::nonNull).toList());

//        7. Find the sum of squares of a list of integers using streams.
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(integers.stream().map(in -> in * in).mapToInt(Integer::intValue).sum());

//        8. Skip the first 5 elements of a list and print the rest.
        System.out.println(integers.stream().skip(5).toList());

//        9. Genrate an infinite sequence of random numbers and print the first 10 numbers.

//        10. Check if any string in a list starts with a specific prefix using streams.
        String prefix = "a";
        System.out.println(strs.stream().anyMatch(s -> s.startsWith(prefix)));



    }
}
