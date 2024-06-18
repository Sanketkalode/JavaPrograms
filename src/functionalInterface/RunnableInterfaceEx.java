package functionalInterface;

import java.util.concurrent.*;

/**
 * @author SanketKalode
 * @date 22-05-2024
 */
public class RunnableInterfaceEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(300);
                    System.out.println("Inside Runnable Interface");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                Thread.sleep(300);
                System.out.println("Inside Callable Interface");
                return "Returning from Callable Interface";
            }
        };

        executor.submit(runnable);
        Future<String> future = executor.submit(callable);
        System.out.println(future.get());
        executor.shutdown();
    }
}
