package streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author SanketKalode
 * @date 13-06-2024
 */
public class StreamSorting {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("abc",23),
          new Person("pqr", 46),
          new Person("abc",23),
          new Person("xyz",42),
          new Person("pqr",46)
        );
        System.out.println(personList);
        personList.stream().distinct().forEach(System.out::println);
//        System.out.println(personList.stream().sorted(Person::).toList());

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return STR."Person{name='\{name}\{'\''}, age=\{age}\{'}'}";
    }
}
