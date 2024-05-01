package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author SanketKalode
 * @date 07-04-2024
 */
public class ExecutorServicesExample {
    public static void main(String[] args) {

        // Single thread pool executor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            singleThreadExecutor.execute(() -> {
                System.out.println(STR."Executing single thread task :\{taskId}\n excuted by thread: \{Thread.currentThread().getName()}");
            });
        }
        singleThreadExecutor.shutdown();
        System.out.println("---------------------------------------------");

        // Fixed Thread pool executor
        ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            fixedThreadExecutor.execute(() -> {
                System.out.println(STR."Executing Fixed thread task :\{taskId}\n excuted by thread: \{Thread.currentThread().getName()}");
            });
        }
        fixedThreadExecutor.shutdown();

        System.out.println("---------------------------------------------");

        // Cached Thread pool executor
        ExecutorService cacExecutorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            cacExecutorService.execute(() -> {
                System.out.println(STR."Executing cache thread task :\{taskId}\n excuted by thread: \{Thread.currentThread().getName()}");
            });
        }
        cacExecutorService.shutdown();
    }
}
