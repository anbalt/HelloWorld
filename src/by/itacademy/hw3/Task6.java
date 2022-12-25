package by.itacademy.hw3;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Add a value");
        Scanner scanner = new Scanner(System.in);

        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int ca = scanner.nextInt();

        if (ab + bc > ca && bc + ca > ab && ca + ab > bc) {
            System.out.println("Triangle");
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }

}

