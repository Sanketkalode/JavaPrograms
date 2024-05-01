package threads;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SanketKalode
 * @date 30-03-2024
 */
public class ThreadsExample_2 {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        Runnable runnable1 = () -> {
            /*System.out.println("Starting new thread.");
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("New Thread completed.");*/

            for (int i = 1; i < 10; i = i + 2) {
                list.add(i);
            }

        };

        Runnable runnable2 = () -> {

            for (int i = 2; i < 10; i = i + 2) {
                list.add(i);
            }
        };

        Thread thread1 = new Thread(runnable1, "runnable1");

        Thread thread2 = new Thread(runnable2, "runnable2");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(list);

        System.out.println("Main thread ended");
    }
}
