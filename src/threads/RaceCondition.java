package threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author SanketKalode
 * @date 31-03-2024
 */

class SharedCounter {
    private AtomicInteger count = new AtomicInteger();

    /*
    * With Atomic classes two or more thread can only access a variable one at a time. With this we can
    * handle a race around condition.
    * */

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

class AnotherCounter{
    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    /*
    * Synchronized keyword can also be used while accessing methods from two or more threads.
    * With this keyword a thread kind of get a lock for a method.
    *
    * The synchronized keyword in Java is used to control access to shared resources.
    * It ensures that only one thread can access a shared resource at a time, thus preventing
    * thread interference and data inconsistency.
    *
    * */
}


public class RaceCondition {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        }).start();

        System.out.println(counter.getCount());

        System.out.println("-------------------------------------------------------------");

        AnotherCounter anotherCounter = new AnotherCounter();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                anotherCounter.increment();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                anotherCounter.increment();
            }
        }).start();

        System.out.println(anotherCounter.getCounter());
    }
}
