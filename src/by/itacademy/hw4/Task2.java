package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a value");

        int n = scanner.nextInt();
        System.out.println("The sum of the numbers:"  + sumUpDigits(n));

        int m = scanner.nextInt();
        System.out.println("The multiplication of the numbers:" + multiplyDigits(m));
    }
    public static int sumUpDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int multiplyDigits(int m) {
        int mul = 1;
        while (m != 0) {
            mul *= (m % 10);
            m /= 10;
        }
        return mul;
    }
}
