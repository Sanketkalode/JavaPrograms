package optional;

import java.util.Optional;

/**
 * @author SanketKalode
 * @date 02-04-2024
 */
public class OptionalExample {

    public static void main(String[] args) {

        OptionalExample user = new OptionalExample();
        Optional<String> username = user.getUsername(23);

        username.ifPresentOrElse(
                uname -> System.out.println(uname),
                () -> System.out.println("Username is not present")
        );

        username.map(String::toUpperCase).ifPresent(System.out::println);
    }

    Optional<String> getUsername(int id) {
        if (id == 0) {
            return Optional.empty();
        } else {
            return Optional.of("Sanket");
        }
    }
}
