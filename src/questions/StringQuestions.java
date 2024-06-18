package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SanketKalode
 * @date 03-06-2024
 */
public class StringQuestions {
    public static void main(String[] args) {

        /*
        * 1. Why string is immutable?
        * 2. Is string thread safe?
        * */


        String a = "abc";

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("From 1st Runnable.");
                a.toUpperCase();
                System.out.println(a);

            }
        };

        Runnable runnable1 = new Runnable() {
            public void run() {
                System.out.println("From 2nd Runnable.");
                System.out.println(a);
            }
        };

        ExecutorService executors = Executors.newFixedThreadPool(2);
        executors.execute(runnable);
        executors.execute(runnable1);
        executors.shutdown();

    }
}
