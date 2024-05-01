package threads;

import java.util.concurrent.*;

/**
 * @author SanketKalode
 * @date 22-04-2024
 */
public class ExecutorServiceExample2 {
    public static void main(String[] args) {

        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
/*        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });

        System.out.println(executor.getPoolSize());
        System.out.println(executor.getQueue().size());*/

        int x =5;
        System.out.println(x++ * ++x);
    }
}
