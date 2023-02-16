package src.by.itacademy.hw13.task2;

public class Main {
    public static void main(String[] args) {
        int[] AI = {3, 7, 9, -3, -1, -5, 10, 15};

        ThreadMinMax thread1 = new ThreadMinMax(AI);
        ThreadMinMax thread2 = new ThreadMinMax(AI);

        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }

        System.out.println("Max: " + thread1.getMax());
        System.out.println("Min: " + thread2.getMin());
    }
}
