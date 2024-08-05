package threads;

import java.util.concurrent.*;

/**
 * @author SanketKalode
 * @date 27-05-2024
 */
public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * Future:
        *   The future class represents a future result of an asynchronous computation.
        * This result will eventually appear in the Future after processing is complete.
        * Long running methods are good candidate for asynchronous processing and Future interface
        * because we can execute other processes while we are waiting for the encapsulated task in
        * the Future to complete.
        * */

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Returned from thread";
        });
        while (!future.isDone()) {
            System.out.println("Future is not done");
            Thread.sleep(500);

        }

        System.out.println(future.get());
        executorService.shutdown();
        System.out.println("Main thread complete");

    }
}
