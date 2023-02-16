package src.by.itacademy.hw13.task1;

public class ThreadStates {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());

        final Shared shared1 = new Shared();
        final Shared shared2 = new Shared();

        Thread thread1 = new Thread(() -> shared1.firstMethod(shared2));

        Thread thread2 = new Thread(() -> shared2.secondMethod(shared1));
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        final Thread thread3 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread4 = new Thread(() -> {
            try {
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread3.getState());

        Thread thread5 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getState());
        });
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());

        Thread thread6 = new Thread() {
            public void run() {
                for (int i = 0; i <= 25; i++)
                    System.out.println(i);
            }
        };
        thread6.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());
    }
}
