package seralization;

import java.io.*;

/**
 * @author SanketKalode
 * @date 28-03-2024
 */
public class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setAge(35);
        person.setName("Monkey D Luffy");
        person.setEmail("luffy@strawhats.com");

        // Serlialization of person object.
        try {
            FileOutputStream stream = new FileOutputStream("person.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);

            objectOutputStream.writeObject(person);

            objectOutputStream.close();
            stream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserilization of person object.

        try {
            FileInputStream stream = new FileInputStream("person.txt");
            ObjectInputStream ois = new ObjectInputStream(stream);

            Person person1 = (Person) ois.readObject();

            System.out.println(person1);

            ois.close();
            stream.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
