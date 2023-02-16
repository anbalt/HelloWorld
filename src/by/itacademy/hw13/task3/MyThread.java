package src.by.itacademy.hw13.task3;

public class MyThread extends Thread {
    private StringBuilder stringBuilder;
    public MyThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder);
            }
            System.out.println();
            char ch = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++ch);
        }
    }
}
