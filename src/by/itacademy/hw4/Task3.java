package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
