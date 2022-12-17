package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Каков результат умножения первого числа на второе?");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;

        System.out.println("Введите первое число");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.println("Введите второе число");
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                c = a * b;
                System.out.println(c);
            } else {
                System.out.println("Ошибка");
            }
        } else {
            System.out.println("Правильный результат");
        }
    }
}







