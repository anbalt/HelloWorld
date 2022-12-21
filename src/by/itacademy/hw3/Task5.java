package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Add a value");
        Scanner scanner = new Scanner(System.in);

        int minute = scanner.nextInt();

        int minute = scanner.nextInt();

        if (minute >= 0 && minute <= 14) {
            System.out.println("First quarter of an hour");
        } else if (minute >= 15 && minute <= 29) {
            System.out.println("Second quarter of an hour");
        } else if (minute >= 30 && minute <= 44) {
            System.out.println("Third quarter of an hour");
        } else if (minute >= 45 && minute <= 59) {
            System.out.println("Fourth quarter of an hour");
        } else {
            System.out.println("Error! The value is not accepted.");
        }
    }
}
