package src.by.itacademy.hw14.task1;

import java.util.Date;

public class ShowTime extends Thread {
    public void run() {
        while (true) {
            Date time = new Date();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(time.getHours());
            stringBuilder.append(":");
            stringBuilder.append(time.getMinutes());
            stringBuilder.append(":");
            stringBuilder.append(time.getSeconds());
            System.out.println(stringBuilder.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
