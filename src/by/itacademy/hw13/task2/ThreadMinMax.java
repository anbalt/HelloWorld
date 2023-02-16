package src.by.itacademy.hw13.task2;

public class ThreadMinMax implements Runnable {
    private Thread thread;
    private int[] array;
    private int maximum;
    private int minimum;

    public ThreadMinMax(int [] Array) {
        array = Array;
        thread = new Thread(this, "Thread1.");
        thread.start();
    }

    public void run() {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        maximum = max;
        minimum = min;
    }

    public Thread getThread() {
        return thread;
    }

    public int getMax() {
        return maximum;
    }

    public int getMin() {
        return minimum;
    }
}
