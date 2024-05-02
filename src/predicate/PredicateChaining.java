package predicate;

import java.util.function.Predicate;

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}


public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 18;
        Predicate<Character> isMale = character -> character == 'M';
        Predicate<Character> isFemale = character -> character == 'F';
        Predicate<Integer> isSeniorCitizen = age -> age <= 60;

        Person person1 = new Person("John", 20, 'M');
        Person person2 = new Person("Jane", 17, 'F');

        System.out.println(STR."Is \{person1.getName()} is an adult? : \{isAdult.test(person1.getAge())}");
        System.out.println(STR."Is \{person2.getName()} is an adult? : \{isAdult.test(person2.getAge())}");

        Predicate<Integer> isYouth = isAdult.and(isSeniorCitizen);

        System.out.println(STR."Is \{person1.getName()} is youth? \{isYouth.test(person1.getAge())}");
        System.out.println(STR."Is \{person2.getName()} is youth? \{isYouth.test(person2.getAge())}");


        StringBuffer sb = new StringBuffer();
        sb.append("Sanket");
        sb.repeat("=",5);
        System.out.println(sb);
    }
}
