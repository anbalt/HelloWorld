package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args) {
        System.out.println("Add a value");
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error! The value is not correct");
        }
    }
}
