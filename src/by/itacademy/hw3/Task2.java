package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a % 2 == 0) {
            if (a > 0)
                System.out.println("Четное положительное число");
            else
                System.out.println("Четное отрицательное число");
        } else {
            if (a < 0)
                System.out.println("Нечетное отрицательное число");
            else
                System.out.println("Нечетное положительное число");
        }

    }
}
