package threads;

/**
 * @author SanketKalode
 * @date 30-03-2024
 */
public class ThreadsExample_1 {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        Thread objThread = new Thread(() ->
        {
            // this is also not a conventional way of creating thread.
            System.out.println("Function thread");
        });

        objThread.start();
    }
}

class MyThread extends Thread{

    // this is old method of creating custom thread.
    @Override
    public void run() {
        System.out.println("Thread 1");
    }
}