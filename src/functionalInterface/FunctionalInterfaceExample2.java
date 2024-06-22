package functionalInterface;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */

@FunctionalInterface
interface Functional {
    void printHello();
}

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) throws InterruptedException {

        Functional print = () -> System.out.println("Hello World");
        print.printHello();
    }
}
