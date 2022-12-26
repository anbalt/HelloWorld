package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        if (a < -9 || a > 9) {
            System.out.println("Ошибка!");
        }

        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (b < -9 || b > 9) {
            System.out.println("Ошибка!");
        }
        
        System.out.println("Каков результат умножения первого числа на второе?");

        int c = scanner.nextInt();
        if (c == a * b) {
            System.out.println("Правильно.");
        } else {
            System.out.println("Ошибка! Правильный результат:" + a * b);
        }
    }
}







