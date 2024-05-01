package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author SanketKalode
 * @date 07-04-2024
 */

class ProducerQueue implements Runnable {
    private BlockingQueue<Integer> queue;

    public ProducerQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i =0;i<10;i++){
            try {
                Thread.sleep(1000);
                queue.put(i);
                System.out.println(STR."Produced: \{i}");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


}

class ConsumerQueue implements Runnable{

    private BlockingQueue<Integer> queue;

    public ConsumerQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                Integer item = queue.take();
                System.out.println(STR."Consumed: \{item}");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    }
}

public class ProducerConsumerProblem {

    public static void main(String[] args) {

        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);

        ProducerQueue producerQueue = new ProducerQueue(blockingQueue);
        ConsumerQueue consumerQueue = new ConsumerQueue(blockingQueue);

        Thread producerThread = new Thread(producerQueue);
        Thread consumerThread = new Thread(consumerQueue);

        producerThread.start();
        consumerThread.start();
    }
}
