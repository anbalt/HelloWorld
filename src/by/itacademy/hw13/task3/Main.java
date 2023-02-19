package src.by.itacademy.hw13.task3;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('1');
        MyThread[] threads = new MyThread[] {
                new MyThread(stringBuilder),
                new MyThread(stringBuilder),
                new MyThread(stringBuilder)
        };
        for (MyThread thread : threads) {
            thread.start();
        }
    }
}
