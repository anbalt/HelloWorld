package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The factorial doesn't exist!");
        }
        else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
