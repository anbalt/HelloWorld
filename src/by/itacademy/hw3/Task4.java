package by.itacademy.hw3;


import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Add three values");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min;
        int middle;
        int max;

        if (a > b) {
            if (a > c) {
                max = a;
                if (c > b) {
                    middle = c;
                    min = b;
                } else {
                    middle = b;
                    min = c;
                }
            } else {
                max = c;
                middle = a;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (c > a) {
                    middle = c;
                    min = a;
                } else {
                    middle = a;
                    min = c;
                }
            } else {
                max = c;
                middle = b;
                min = a;
            }
            System.out.println(min + " " + middle + " " + max);
        }
    }
}
