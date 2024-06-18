package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SanketKalode
 * @date 05-06-2024
 */
public class SleepAndWait {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("In thread 1!!");
                try {
                    wait(120);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("In thread 2!!");
                try {
                    Thread.sleep(120);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.shutdown();
    }
}
