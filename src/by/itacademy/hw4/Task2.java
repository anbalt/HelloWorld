package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Add a positive value to sum up its digits:");
        int n = scanner.nextInt();
        System.out.println("The sum of the positive numbers:"  + sumUpPositiveDigits(n));

        System.out.println("Add a negative value to sum up its digits:");
        int n2 = scanner.nextInt();
        System.out.println("The sum of the negative numbers:"  + sumUpNegativeDigits(n2));

        System.out.println("Add a positive value to multiply its digits:");
        int m = scanner.nextInt();
        System.out.println("The multiplication of the positive numbers:" + multiplyPositiveDigits(m));

        System.out.println("Add a negative value to multiply  its digits:");
        int m2 = scanner.nextInt();
        System.out.println("The multiplication of the negative numbers:" + multiplyNegativeDigits(m2));
    }
    
    public static int sumUpPositiveDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int sumUpNegativeDigits(int n2) {
        int sum = 0;
        while (n2 != 0) {
            sum += (n2 % 10);
            n2 /= 10;
        }
        return sum;
    }
    
    public static int multiplyPositiveDigits(int m) {
        int mul = 1;
        while (m > 0) {
            mul *= (m % 10);
            m /= 10;
        }
        return mul;
    }
    
    public static int multiplyNegativeDigits(int m2) {
        int mul = -1;
        while (m2 < 0) {
            mul *= (m2 % 10);
            m2 /= 10;
        }
        return mul;
    }
}
