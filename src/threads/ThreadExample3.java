package threads;

/**
 * @author SanketKalode
 * @date 13-06-2024
 */
public class ThreadExample3 {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();
        thread1.start();

        MyThread1 thread2 = new MyThread1();
        thread2.run();

        MyThread1 thread3 = new MyThread1();
        thread3.run();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Form Thread, "+Thread.currentThread().getName());
    }
}
