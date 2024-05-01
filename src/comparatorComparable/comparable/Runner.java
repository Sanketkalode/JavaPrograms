package comparatorComparable.comparable;

import comparatorComparable.comparable.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SanketKalode
 * @date 29-03-2024
 */
public class Runner {

    public static void main(String[] args) {

        Person p1 = new Person(1,"abc",23,"abc@heor.com");

        Person p2 = new Person(4,"afd",23,"afd@heor.com");

        Person p3 = new Person(2,"ght",23,"ght@heor.com");

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        Collections.sort(personList);

        for (Person person:personList){
            System.out.println(person);
        }

    }
}
