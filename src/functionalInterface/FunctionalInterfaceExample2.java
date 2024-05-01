package functionalInterface;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */

@FunctionalInterface
interface Functional {
    void printHello();
}

public class FunctionalInterfaceExample2 implements Functional {
    public static void main(String[] args) throws InterruptedException {
        FunctionalInterfaceExample2 example2 = new FunctionalInterfaceExample2();
        example2.printHello();

        long start =  (System.currentTimeMillis());
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            count++;

        }
//        Thread.sleep(3);
        long end =  System.currentTimeMillis();
        System.out.println(end - start);

    }

    @Override
    public void printHello() {
        System.out.println("Hello");
    }
}
