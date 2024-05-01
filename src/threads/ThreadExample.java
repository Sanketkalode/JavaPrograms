package threads;

/**
 * @author SanketKalode
 * @date 03-04-2024
 */
public class ThreadExample implements Runnable{
    @Override
    public void run() {
        System.out.print("runnning");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadExample());
        t.run();
        t.run();
        t.start();
    }
}
