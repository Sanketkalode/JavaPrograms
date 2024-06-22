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

        long start =  (System.currentTimeMillis());
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            count++;

        }
//        Thread.sleep(3);
        long end =  System.currentTimeMillis();
        System.out.println(end - start);

    }
}
