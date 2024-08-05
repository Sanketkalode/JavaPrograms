package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise1 {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();

        Runnable runnable1 = () -> {
            while (i.get() < 50) {

                try {
                    i.getAndIncrement();
                    Thread.sleep(300);
                    System.out.println(i);
                    System.out.println("In thread 1");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Runnable runnable2 = () -> {
            while (i.get() < 50) {

                try {
                    i.getAndIncrement();
                    Thread.sleep(300);
                    System.out.println(i);
                    System.out.println("In thread 2");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        executor.submit(runnable1);
        executor.submit(runnable2);

        executor.shutdown();

    }
}
