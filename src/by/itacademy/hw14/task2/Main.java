package src.by.itacademy.hw14.task2;

public class Main {
    public static void main(String[] args) {
        Fork[] forks = new Fork[]{new Fork(), new Fork(), new Fork(), new Fork(), new Fork()};

        Thread thread1 = new Thread(new Philosopher(forks[4],forks[0]));
        thread1.setName("Aristotle");
        Thread thread2 = new Thread(new Philosopher(forks[0],forks[1]));
        thread2.setName("Plato");
        Thread thread3 = new Thread(new Philosopher(forks[2], forks[1]));
        thread3.setName("Socrates");
        Thread thread4 = new Thread(new Philosopher(forks[2], forks[3]));
        thread4.setName("Pythagoras");
        Thread thread5 = new Thread(new Philosopher(forks[4], forks[3]));
        thread5.setName("Democritus");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
