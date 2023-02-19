package src.by.itacademy.hw13.task1;

public class Shared {
    synchronized void firstMethod(Shared shared) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shared.secondMethod(this);
    }
    synchronized void secondMethod(Shared shared) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shared.firstMethod(this);
    }
}
