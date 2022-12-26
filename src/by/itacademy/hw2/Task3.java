package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args) {
        int s = 1300000;
        int sec = s % 60;
        int m = s / 60;
        int min = m % 60;
        int h = m / 60;
        int hours = h % 24;
        int d = h / 24;
        int days = d % 7;
        int w = d / 7;

        System.out.println(w + " weeks " + days + " days " + hours + " hours " + min + " minutes " + sec + " seconds ");
    }

}
