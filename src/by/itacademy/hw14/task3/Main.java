package src.by.itacademy.hw14.task3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        for (int i = 0; i < 10; i++) {
            new Thread(new Producer(store)).start();
            new Thread(new Consumer(store)).start();
        }
    }
}
