package src.by.itacademy.hw14.task2;

public class Fork {
    private static int count;
    private int id;
    private boolean notAvailable;

    public Fork() {
        id = ++count;
        notAvailable = false;
    }

    public synchronized void take() {
        if (notAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " took a fork" + id);
        notAvailable = true;
    }

    public synchronized void give() {
        System.out.println(Thread.currentThread().getName() + " gave a fork " + id + " to another philosopher");
        notAvailable = false;
        notify();
    }
}
