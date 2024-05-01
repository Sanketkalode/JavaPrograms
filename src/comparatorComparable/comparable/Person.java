package comparatorComparable.comparable;

/**
 * @author SanketKalode
 * @date 29-03-2024
 */
public class Person implements Comparable<Person> {

    private int id;
    private String name;
    private int age;
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Person o) {
        if (id == o.id) {
            return 0;
        } else if (id > o.id) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return STR."Person{id=\{id}, name='\{name}\{'\''}, age=\{age}, email='\{email}\{'\''}\{'}'}";
    }
}
