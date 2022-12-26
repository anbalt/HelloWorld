package by.itacademy.hw2;

public class Task6 {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 7.8;
        double c = 9.1;

        if (a < b) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b < c) {
                System.out.println(b); }
            else {
                System.out.println(c);
            }
        }
    }
}
