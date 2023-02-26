package src.by.itacademy.hw14.task3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Store {
    private final int MAX_SIZE = 5;
    private final Semaphore producerSemaphore = new Semaphore(MAX_SIZE);
    private final Semaphore consumerSemaphore = new Semaphore(0);
    private Integer count = 0;
    private final Lock lock = new ReentrantLock();
    boolean locked;

    public void produce() {
        try {
            producerSemaphore.acquire();
            Thread.sleep((long)(Math.random() * 2000));
        } catch (InterruptedException e) {
            System.out.println("Error! " + e);
        }

        while(!lock.tryLock()) {
           continue;
        }
        count++;
        lock.unlock();
        System.out.println("1 item was added to the store. Items total: " + count);

        consumerSemaphore.release();
    }

    public void buy() {
        try {
            consumerSemaphore.acquire();
            Thread.sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e) {
            System.out.println("Error! " + e);
        }

        while(!lock.tryLock()) {
            continue;
        }
        count--;
        lock.unlock();
        System.out.println("1 item was bought. Items total: " + count);

        producerSemaphore.release();
    }
}
