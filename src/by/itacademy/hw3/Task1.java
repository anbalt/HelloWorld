package by.itacademy.hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Add a value");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a % 2 != 0) {
            System.out.println("The value is not even");
        } else {
            System.out.println("The value is even");
        }
    }
}
